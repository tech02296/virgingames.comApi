package com.virgingames.cucumber;

import com.virgingames.testbase.TestBase;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Jay
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/")

public class CucumberRunner extends TestBase {

}
