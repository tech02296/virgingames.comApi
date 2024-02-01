package com.virgingames.cucumber.steps;


import com.virgingames.gameinfo.VirgingamesSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

import static org.hamcrest.Matchers.equalTo;

public class MyStepdefs {
    static ValidatableResponse response;
    @Steps
    VirgingamesSteps virgingamesSteps;

    @When(": I send a Get request")
    public void iSendAGetRequest() {
        response = virgingamesSteps.getAllBingoInfo();

    }

    @Then(": I get vaild response code {int}")
    public void iGetVaildResponseCode(int arg0) {
        response.statusCode(200);
    }


    @And(": I verify currency GBP in bingo data")
    public void iVerifyCurrencyGBPInBingoData() {
        response.body("data.pots[2].name",equalTo("Enterprise"));
    }


    @And(": I verify name is Enterprise in bingo data")
    public void iVerifyNameIsEnterpriseInBingoData() {
        response.body("data.pots[2].currency",equalTo("GBP"));
    }
}
