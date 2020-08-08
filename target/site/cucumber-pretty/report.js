$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 3,
  "name": "HomePage feature",
  "description": "",
  "id": "homepage-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 10005956881,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "Given: I am on Darksky HomePage",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 9,
  "name": "Verify min max temperature",
  "description": "",
  "id": "homepage-feature;verify-min-max-temperature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I click today area on HomePage",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I get temperatures on HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I get min temperature on HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I get max temperature on HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify min temperature on HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I verify max temperature on HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.clickToday()"
});
formatter.result({
  "duration": 1421999075,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.allTemperatures()"
});
formatter.result({
  "duration": 857766520,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getMin()"
});
formatter.result({
  "duration": 187509,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.getMax()"
});
formatter.result({
  "duration": 146103,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMinTemp()"
});
formatter.result({
  "duration": 49347796,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyMaxTemp()"
});
formatter.result({
  "duration": 41029843,
  "status": "passed"
});
formatter.after({
  "duration": 323798957,
  "status": "passed"
});
});