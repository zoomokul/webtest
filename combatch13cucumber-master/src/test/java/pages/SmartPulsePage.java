package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartPulsePage {
    public SmartPulsePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//a[text()=' ÜRETİM']")
    public  WebElement uretimLink;

    @FindBy(xpath = "//a[text()='  Planlama']")
    public WebElement planlamaLink;

    @FindBy(xpath = "//a[text()=' KGÜP']")
    public WebElement kgupLink;

    @FindBy(xpath = "//input[@id='j_idt219:date1_input']")
    public WebElement baslangicTarih;

    @FindBy(xpath = "//input[@id='j_idt219:date2_input']")
    public WebElement bitisTarih;

    @FindBy(xpath = "//span[@class='ui-button-text ui-c']")
    public WebElement uygulamaLink;

    @FindBy(xpath = "//img[@id='j_idt219:dt:j_idt269']")
    public WebElement excelIndir;

    @FindBy(xpath = "(//span[@class='ui-icon ui-icon-closethick'])[1]")
    public WebElement popUp1;
}
