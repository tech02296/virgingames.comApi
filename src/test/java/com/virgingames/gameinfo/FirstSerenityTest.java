package com.virgingames.gameinfo;

import com.virgingames.testbase.TestBase;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Jay
 */
@RunWith(SerenityRunner.class)
public class FirstSerenityTest extends TestBase {

    @Test
    public void getAllJackpotData(){
        SerenityRest.given()
                .when()
                .get("/bingo")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Title("This test will get the information of all jackpot data")
    @Test
    public void test001(){
        SerenityRest.given()
                .when()
                .get("/bingo")
                .then()
                .log()
                .all()
                .statusCode(200);
    }

}
