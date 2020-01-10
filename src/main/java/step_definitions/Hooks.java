package step_definitions;

import io.cucumber.java.After;
import utilities.Driver;

public class Hooks {  // to end up and setup of the closing
    @After
    public  void teardown(){
        System.out.println("Closing browser");
            Driver.getDriver().quit();
    }
}
