package cucumber_example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/vowels-count.feature"},
        glue = {"cucumber_example"})

public class TestRunner {
}