package stepsdefenition; /**
 * Created by Svitlana_Peleshenko on 9/21/2018.
 */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},glue = "stepsdefenition")
public class RunnerTest {
}
