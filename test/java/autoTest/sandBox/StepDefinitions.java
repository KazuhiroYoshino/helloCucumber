package autoTest.sandBox;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("ここは地球である")
    public void ここは地球である() {
        System.out.println("ここは水の星、地球である");
    }

    @When("今日も日が昇る")
    public void 今日も日が昇る() {
        System.out.println("今日もいつものように日が昇る");
    }

    @Then("明日も日が昇る")
    public void 明日も日が昇る() {
        System.out.println("望まずとも、明日も日が昇るだろう");
    }
}
