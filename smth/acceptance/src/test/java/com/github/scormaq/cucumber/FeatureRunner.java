package com.github.scormaq.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "classpath:features",
    glue = "com.github.scormaq.cucumber.definitions")
public class FeatureRunner {
}
