package autoTest.sandBox;

import cucumber.api.java.ja.ならば;
import cucumber.api.java.ja.もし;
import cucumber.api.java.ja.前提;

public class StepDefinitions {
    @前提("ここは地球である")
    public void ThiIsEarth() {
        System.out.println("ここは水の星、地球である");
    }

    @もし("今日も日が昇る")
    public void TodayRisingSun() {
        System.out.println("今日もいつものように日が昇る");
    }

    @ならば("明日も日が昇る")
    public void TomorrowRisingSun() {
        System.out.println("望まずとも、明日も日が昇るだろう");
    }
}
