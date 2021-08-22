package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YandexPage;
import utilities.ConfigReader;
import utilities.Driver;

public class YandexStepDefinition {
    YandexPage yandexPage=new YandexPage();
    @Given("Kullanici yandex anasayfa gider")
    public void kullanici_yandex_anasayfa_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));
    }




    @When("yandex iPhone icin arama yapar")
    public void yandex_i_phone_icin_arama_yapar() {
        yandexPage.aramakutusu.sendKeys("IPhone"+ Keys.ENTER);

    }

    @Then("yandex sonuclarin iPhone icerdigini test eder")
    public void yandex_sonuclarin_i_phone_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("IPhone"));

    }








    @When("Yandex tea pot icin arama yapar")
    public void yandex_tea_pot_icin_arama_yapar() {
        yandexPage.aramakutusu.sendKeys("tea pot"+ Keys.ENTER);
    }
    @Then("Yandex sonuclarin tea pot icerdigini test eder")
    public void yandex_sonuclarin_tea_pot_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tea pot"));
    }

}
