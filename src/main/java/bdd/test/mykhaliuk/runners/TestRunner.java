package bdd.test.mykhaliuk.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/bdd/test/mykhaliuk/features/login.feature",
glue={"steps"})
public class TestRunner {

}
