#!/usr/bin/python

#
# Generate StudentAssessment XML data from .CSV data file
# 
# Created by J. Hinsdale of Wireless Generation 20Feb2013
#

import sys

# This has a mapping of "Last,First" to the StudentUniqueStateId
import student_map

# This has a mapping of assessment scores to color code
import level_color_map

#
# Main driver
#
def main(argv):

    # Various input files.  Emit header, then templates populated with data, then footer
    header_fn = "header.xml"
    footer_fn = "footer.xml"
    template_fn = "template.xml"
    data_fn = "input.csv"
    
    print slurp_file(header_fn)

    # Map sheet column number to corresponding short assessment name
    assessment_short_name = {
        8: "DIBELS Next Composite",
        10: "DORF (Fluency)",
        12: "DORF (Accuracy)",
        14: "DORF (Retell)",
        16: "DORF (Retell Quality)",
        18: "DORF (Daze)",
        20: "TRC",
    }

    # Get XML template with substitutable variables
    template = slurp_file(template_fn)

    # For each line in .CSV input, 
    count = 0
    with open(data_fn) as datafile:
        for line in datafile:
            # Ignore column header line
            count += 1
            if count == 1:
                continue

            # Extract relevent spreadsheet columns
            flds = line.strip().split(",")
            lname = flds[3]
            fname = flds[4]
            grade = flds[6]
            period = flds[7]

            # Map student name to ID
            student_id = student_map.name2id[lname + "," + fname]

            # Ignore student_id 500000000 Matthew Corker since he is hand crafted right now
            # We could expand this script to handle him as well if we feel motivated
            if student_id == 500000000:
                continue

            # Map benchmark period to administration date
            admin_date = None
            if period == "BOY":
                composite_admin_date = "2012-10-01"
                admin_date = "2012-10-02"
            elif period == "MOY":
                composite_admin_date = "2012-02-01"
                admin_date = "2013-02-02"
            elif period == "EOY":
                composite_admin_date = "2012-06-01"
                admin_date = "2013-06-02"
            else:
                raise Exception("Bad period '" + period + "'")

            # Generate a <StudentAssessment> block for each of the repeating assessment/score column pairs
            pair_start = [ 8, 10, 12, 14, 16, 18, 20 ]
            for p in pair_start:
                short_name = assessment_short_name[p]
                level = flds[p]
                color = level_color_map.level2color[level]
                score = flds[p + 1]
                title = short_name + " Fifth Grade 12-13 " + period
                comment = fname + " " + lname + " (" + str(student_id) + ") / " + short_name + " / " + period
                if p == 8:
                    reporting_method = "Composite Score"
                else:
                    reporting_method = "Mastery level"
                    
                # __AdministrationDate__     BOY = 2012-10-01   MOY 2013-02-01
                # __AssessmentTitle__      "<assmt short name> <gradelevel> 12-13 <bench period>"
                # __Score__
                # __Color__
                # __Level__
                # __StudentId__            Map from first, last name
            
                # Apply substitutions to XML template and print it
                xml = template
                subst_map = [
                    [ "__AdministrationDate__", admin_date ],
                    [ "__AssessmentTitle__", title ],
                    [ "__AssessmentReportingMethod__", reporting_method ],
                    [ "__Score__", score ],
                    [ "__Level__", level ],
                    [ "__Color__", color ],
                    [ "__StudentId__", student_id ],
                    [ "__Comment__", comment ],
                ]
                for subst_pair in subst_map:
                    xml = xml.replace(subst_pair[0], str(subst_pair[1]))

                print xml

    # Footer
    print slurp_file(footer_fn)

#
# Slurp in contents of file to a string
#
def slurp_file(fn):
    result = ""
    with open(fn) as myfile:
        for line in myfile:
            result += line
    return result

# Call main driver
main(sys.argv)
