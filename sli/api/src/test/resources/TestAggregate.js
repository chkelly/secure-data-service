
//clear all previous aggregation data, this is for testing/demo only
db.aggregation.drop();

//all of these strings should come from the aggregationdefinition table
var inputCollectionName = "studentAssessmentAssociation";
var mapFunction = db.system.js.findOne({"_id":"mapDistrictPerf1to4"}).value;
var reduceFunction = db.system.js.findOne({"_id":"reducePerf1to4"}).value;
var finalizeFunction = db.system.js.findOne({"_id":"finalizePerf1to4"}).value;
var cleanupFunction = db.system.js.findOne({"_id":"cleanupBodyAndId"}).value;
var outputCollectionName = "aggregation";
var aggregationName = "8th Grade EOG";
var params = ["67ce204b-9999-4a11-aaaa-000000000002", "67ce204b-9999-4a11-aaaa-000000000001","67ce204b-9999-4a11-aaaa-000000000000"];
var queryField = "body.assessmentId";
var query = {};
query[queryField] = {$in:params};

//execute aggregation
db.runCommand( { 
    mapreduce:inputCollectionName,
    map:mapFunction,
    reduce:reduceFunction,
    finalize:finalizeFunction,
    query: query,
    scope: { aggregation_name : aggregationName, execution_time : new Date() },
    out: { reduce: outputCollectionName }
});

//clean up results so they can be found properly by the API's handlers
db.runCommand({"$eval" : cleanupFunction });

//show results
db.aggregation.find();
