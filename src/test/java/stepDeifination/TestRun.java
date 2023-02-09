package stepDeifination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\eclipse-thiru\\Cucumber_Maven\\src\\test\\resources\\Features\\TC001.feature", 
glue = {"@Login" }

)

public class TestRun {

}
