package com.virgingames.testbase;


import com.virgingames.constants.Path;
import com.virgingames.utils.PropertyReader;
import io.restassured.RestAssured;

import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.JACKPOT;
    }
}

// RestAssured.baseURI = PropertyReader.getInstance().getProperty("baseURI");
//Inside PropertyReader class
// inside getInstance() method
//then go to getProperty() method
//inside that config.properties path given
//inside baseURI


