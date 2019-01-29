package com.github.scormaq.cucumber.definitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;

public class Definitions {

    @Given("something useful is tested")
    public void doCheck() {
        Assert.assertEquals(1L, 1L);
    }

}
