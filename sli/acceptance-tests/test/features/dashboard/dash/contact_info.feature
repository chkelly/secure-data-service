Feature:  View Student's contact information
As a teacher in a school district, I want to click on a student and be directed to their profile page that contains the student's contact info

Background:
Given I have an open web browser
Given the server is in "test" mode
When I navigate to the Dashboard home page
Given I am authenticated to SLI as "lkim" password "lkim"
When I click on the Dashboard page
And I wait for "1" seconds
When I select ed org "Daybreak School District 4529"
When I select school "East Daybreak Junior High"
When I select course "8th Grade English"
When I select section "M. Jones - 8th Grade English - Sec 6"
And I wait for "2" seconds

Scenario: View a student with 1 email, 1 address, 1 phone
Given I click on student "Imelda Lindsey"
And I view its student profile
And I look at the panel "Contact Information"
And there are "1" phone numbers
And the list of phone number includes "708-432-9033"
And the phone number "708-432-9033" is of type "Unlisted"  
And there are "1" email addresses
And the list of email address includes "Imelda_Lindsey@yahoo.com"
And there are "1" addresses
And the list of address includes
"""
1558 4th Street, APT 7776
Chicago, IL 60139-2152
"""

Scenario: View a student with 2 phone numbers, 3 emails, 2 addresses
Given I click on student "Brielle Klein"
And I view its student profile
And I look at the panel "Contact Information"
And there are "2" phone numbers
And the list of phone number includes "630-667-8063"
And the list of phone number includes "773-445-2464"
And the order of the phone numbers is "773-445-2464;630-667-8063"
And there are "3" email addresses
And the list of email address includes "Brielle.Klein@yahoo.com"
And the list of email address includes "B.Klein@gmail.com"
And the list of email address includes "Brielle_Klein@gmail.com"
And there are "2" addresses
And the list of address includes
"""
1537 Steuben Street, APT 330
New York, NY 10753-2389
""" 
And the list of address includes
"""
8124 Brighton 3 Place
Chicago, IL 60848-7633
"""

Scenario:  Student has no phone numbers and no email addresses
Given I click on student "Patricia Harper"
And I view its student profile
And I look at the panel "Contact Information"
And there are "0" phone numbers
And there are "0" email addresses

Scenario: Student has no addresses
Given I click on student "Astra Vincent"
And I view its student profile
And I look at the panel "Contact Information"
And there are "0" addresses

Scenario: Include a building site number on its own line
Given I click on student "Rhonda Delgado"
And I view its student profile
And I look at the panel "Contact Information"
And there are "2" addresses
And the list of address includes 
"""
3655 Brighton 2nd Lane, APT 4221
351
Chicago, IL 60908-1028
"""
	
Scenario:  An address with countryCode other than US
Given I click on student "Rhonda Delgado"
And I view its student profile
And I look at the panel "Contact Information"
And there are "2" addresses
And the list of address includes 
"""
9857 Kingsborough 2nd Walk
Toronto, ON A1B 2C3
CA
"""

Scenario:  primaryTelephoneNumber is not present
Given I click on student "Nicholas Burks"
And I view its student profile
And I look at the panel "Contact Information"
And there are "1" phone numbers
And the list of phone number includes "708-929-8507"

Scenario:  Student's home phone number is not his primary number
Given I click on student "Alec Swanson"
And I view its student profile
And I look at the panel "Contact Information"
And there are "7" phone numbers
And the order of the phone numbers is "312-230-0970;331-152-6310;219-861-1785;262-860-2296;815-462-0519;630-115-0626;219-328-5624"

@wip
Scenario: Max (10) phone numbers 
Given the server is in "test" mode	

@wip	
Scenario: Max (10) email addresses
Given the server is in "test" mode

@wip
Scenario:  Max (4) address
Given the server is in "test" mode

@wip
Scenario: End Date in address is earlier than today's date
Given the server is in "test" mode

@wip
Scenario: Begin Date in address is later than today's date
Given the server is in "test" mode
	
