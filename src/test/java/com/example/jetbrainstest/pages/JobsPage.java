package com.example.jetbrainstest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobsPage {

    private final Logger LOG = LoggerFactory.getLogger(JobsPage.class);

    WebDriver driver;

    @FindBy(css = "._content_ud38m4_207")
    private WebElement findYourDreamJob;

    @FindBy(css = "._button_937yxw_133")
    private WebElement jobRoles;

    public Boolean checkDream() {
        LOG.info("Проверка активности кнопки *Find*Your*Dream*Job*");
        return findYourDreamJob.isEnabled();
    }

    public void checkDreamInList() {
        findYourDreamJob.click();
        // ожидание должно быть здесь?
        jobRoles.click();
        //ожидание? ловим список из ._content_4bkrr3_40
        List<WebElement> roles = driver.findElements(By.cssSelector("._content_4bkrr3_40"));
    }

    public JobsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
