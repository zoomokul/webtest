package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import pages.AmazonPage;
import pages.SmartPulsePage;
import utilities.ConfigReader;
import utilities.Driver;

public class SmartPulseStepDefinition {
    SmartPulsePage smartPage=new SmartPulsePage();
    @Given("Sayfaya gider")
    public void sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("smartPulse_url"));
    }

    @And("Uretim menüsüne tıklar")
    public void uretim_menüsüne_tıklar() {
        //smartPage.popUp1.click();
       //Driver.getDriver().findElement(By.xpath("//a[@id='j_idt22:j_idt26']")).click();

        smartPage.uretimLink.click();
    }
    @And("Planlama menüsüne tıklar")
    public void planlama_menüsüne_tıklar() {
        smartPage.planlamaLink.click();

    }
    @And("KGUP menüsüne tıklar")
    public void kgup_menüsüne_tıklar() {
        smartPage.kgupLink.click();

    }
    @And("Verisini indirmek istediği tarihi girer")
    public void verisini_indirmek_istediği_tarihi_girer() {
        smartPage.baslangicTarih.sendKeys(ConfigReader.getProperty("baslangic_tarih"));
        smartPage.bitisTarih.sendKeys(ConfigReader.getProperty("bitis_tarih"));

        smartPage.uygulamaLink.click();


    }
    @Then("Veriyi indirir")
    public void veriyi_indirir() {
        smartPage.excelIndir.click();
        //Driver.getDriver().close();

    }
}
