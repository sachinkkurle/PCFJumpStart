$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Account.feature");
formatter.feature({
  "line": 1,
  "name": "Applciation Login",
  "description": "",
  "id": "applciation-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@SomkeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User login into application with \"jin\" and \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Cards diplayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 44
    }
  ],
  "location": "stepDefination.user_login_into_application_with_something_and_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 20
    }
  ],
  "location": "stepDefination.cards_diplayed_are_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@MobileTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login into application with \"jhon\" and \"4321\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards diplayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "jhon",
      "offset": 34
    },
    {
      "val": "4321",
      "offset": 45
    }
  ],
  "location": "stepDefination.user_login_into_application_with_something_and_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 20
    }
  ],
  "location": "stepDefination.cards_diplayed_are_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Applciation Login",
  "description": "",
  "id": "applciation-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with \u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards diplayed are \"true\"",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "applciation-login;home-page-default-login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 21,
      "id": "applciation-login;home-page-default-login;;1"
    },
    {
      "cells": [
        "user1",
        "password1"
      ],
      "line": 22,
      "id": "applciation-login;home-page-default-login;;2"
    },
    {
      "cells": [
        "user2",
        "password2"
      ],
      "line": 23,
      "id": "applciation-login;home-page-default-login;;3"
    },
    {
      "cells": [
        "user3",
        "password3"
      ],
      "line": 24,
      "id": "applciation-login;home-page-default-login;;4"
    },
    {
      "cells": [
        "user4",
        "password4"
      ],
      "line": 25,
      "id": "applciation-login;home-page-default-login;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 22,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user1 and password1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards diplayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "user1",
      "offset": 34
    },
    {
      "val": "password1",
      "offset": 44
    }
  ],
  "location": "stepDefination.user_login_in_to_application_with_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 20
    }
  ],
  "location": "stepDefination.cards_diplayed_are_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user2 and password2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards diplayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "user2",
      "offset": 34
    },
    {
      "val": "password2",
      "offset": 44
    }
  ],
  "location": "stepDefination.user_login_in_to_application_with_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 20
    }
  ],
  "location": "stepDefination.cards_diplayed_are_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 24,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user3 and password3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards diplayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "user3",
      "offset": 34
    },
    {
      "val": "password3",
      "offset": 44
    }
  ],
  "location": "stepDefination.user_login_in_to_application_with_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 20
    }
  ],
  "location": "stepDefination.cards_diplayed_are_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User login in to application with user4 and password4",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Cards diplayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "user4",
      "offset": 34
    },
    {
      "val": "password4",
      "offset": 44
    }
  ],
  "location": "stepDefination.user_login_in_to_application_with_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 20
    }
  ],
  "location": "stepDefination.cards_diplayed_are_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 29,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@PortalTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "User signup with folliwng details",
  "rows": [
    {
      "cells": [
        "jenny",
        "abcd",
        "john@acbd.com",
        "Aussie",
        "13131"
      ],
      "line": 33
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Cards diplayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.user_signup_with_folliwng_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 20
    }
  ],
  "location": "stepDefination.cards_diplayed_are_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 42,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "User login into application with \"jin\" and \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Cards are Displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "jin",
      "offset": 34
    },
    {
      "val": "1234",
      "offset": 44
    }
  ],
  "location": "stepDefination.user_login_into_application_with_something_and_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.cards_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 52,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@SomkeTest"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "User login into application with \"jhon\" and \"4321\"",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "Cards are not Displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "jhon",
      "offset": 34
    },
    {
      "val": "4321",
      "offset": 45
    }
  ],
  "location": "stepDefination.user_login_into_application_with_something_and_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.cards_are_not_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "validate the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is triggerd",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check if browser is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.validate_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.browser_is_triggerd()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.check_if_browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 60,
  "name": "Home page default login",
  "description": "",
  "id": "applciation-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@SomkeTest"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "User is on net banking Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "User login into application with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "Cards are Displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.user_login_into_application_with_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.home_page_is_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefination.cards_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
});