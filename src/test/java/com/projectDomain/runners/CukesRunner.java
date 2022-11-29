package com.projectDomain.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"prety",   // basically it just prints out additional information about the scenario that is being executed.it is not so necessary
                "html:target/cucumber-report.html", // comes with cucumber, no need to dependency
                "rerun:target/rerun.txt",  // it is for FailedTestRunner class, comes with cucumber, no need to dependency
                "me.jvt.cucumber.report.PrettyReports:target/cucumber" // it is for cucumber report and optional, need to dependency
        },
        features = "src/test/resources/features",  //copy path from content root, because it is in different packages from runnerCukes
        glue = "com/projectDomain/step_definitions",   // copy path from source root, because it is in the same packages with cukesRunner
        dryRun = false,
        tags = "@smoke"
        // publish = true // can be used to generate automatically a link for the report of our final execution of our code and printed in the console. it will be ready to share with anyone

)

public class CukesRunner {
}
