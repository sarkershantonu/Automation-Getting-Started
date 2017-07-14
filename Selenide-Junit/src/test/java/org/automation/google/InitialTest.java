package org.automation.google;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
/**
 * Created by shantonu on 7/14/17.
 */
public class InitialTest {

    @Test
    public void search_google(){
        open("https://www.google.com");
        $(By.name("q")).val("shantonu sarker").pressEnter();

    }
}
