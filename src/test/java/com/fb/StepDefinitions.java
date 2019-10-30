package com.fb;

import com.fb.Page;
import io.cucumber.java.en.Given;

public class StepDefinitions {
    @Given("I am on FB main page")
    public void I_am_on_FB_main_page() throws Throwable {
        Page page = new Page();
        page.set(1);
    }
}
