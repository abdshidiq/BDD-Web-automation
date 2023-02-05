$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckOut.feature");
formatter.feature({
  "line": 2,
  "name": "CheckOut",
  "description": "As a user i want to checkout item from the website",
  "id": "checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 7481428940,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User wants to checkout one item from the website saucedemo",
  "description": "",
  "id": "checkout;user-wants-to-checkout-one-item-from-the-website-saucedemo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User choice 2 product from the list",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User click item To Chart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User already on checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User verify that \"Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)\" as products in a list",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User remove \"Test.allTheThings() T-Shirt (Red)\" as products in a list",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User checkout the selected product",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User input the checkout information with first name \"Abdul Rohman\" and last name \"Shidiq\" then postal code \"16417\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click the checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User verify item total, tax, total on checkout summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User already in checkout complete page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 278277097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 3561399017,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.verifyLandingPage()"
});
formatter.result({
  "duration": 67284704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "PurchaseStep.sortProductValue(String)"
});
formatter.result({
  "duration": 3207352362,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.choiceProduct()"
});
formatter.result({
  "duration": 4920619490,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.addToChart()"
});
formatter.result({
  "duration": 3132559522,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.verifyCheckOutPage()"
});
formatter.result({
  "duration": 3046312330,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)",
      "offset": 18
    }
  ],
  "location": "PurchaseStep.verifyListOfProduct(String)"
});
formatter.result({
  "duration": 3122843649,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 13
    }
  ],
  "location": "PurchaseStep.removeListOfProduct(String)"
});
formatter.result({
  "duration": 3089740118,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.checkOutTheProduct()"
});
formatter.result({
  "duration": 3099842573,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abdul Rohman",
      "offset": 53
    },
    {
      "val": "Shidiq",
      "offset": 82
    },
    {
      "val": "16417",
      "offset": 108
    }
  ],
  "location": "PurchaseStep.inputFirstName(String,String,String)"
});
formatter.result({
  "duration": 3443933880,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.clickBtnContinue()"
});
formatter.result({
  "duration": 3145129149,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.verifyDetailTotalCheckOutSummaryPage()"
});
formatter.result({
  "duration": 3138954096,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.clickButtonFinishCheckOut()"
});
formatter.result({
  "duration": 3111985704,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseStep.verifyCheckOutCompletePage()"
});
formatter.result({
  "duration": 3043927836,
  "status": "passed"
});
formatter.after({
  "duration": 828571852,
  "status": "passed"
});
});