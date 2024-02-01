package com.virgingames.gameinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class VirgingamesSteps {
    @Step("Getting all bingo data information")
    public ValidatableResponse getAllBingoInfo() {
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.GET_ALL_BINGODATA)
                .then();

    }
}
