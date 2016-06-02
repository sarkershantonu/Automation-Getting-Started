package org.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by shantonu on 3/12/16.
 */
public class TestGoogleSearch {
    private GooglePage google = null;

    WebDriver aBrowser = null;

    @Before
    public void init(){
        //aBrowser =new FirefoxDriver();
        aBrowser = Browser.getInstance();
        google = new GooglePage(aBrowser);
    }

    @Test
    public void testCancelSearch(){
        Assert.assertEquals("Google", google.openPage().getTitle());
        Assert.assertEquals("Title =>","Google Doodles", google.clickImFeelingLuckyButton().getTitle());

    }

    @Test
    public void searchAnItem(){
        String searchText = "Shantonu";
        google.typeOnSearchText(searchText);
        google.clickSearchLink();
        google.typeOnSearchText("kasaksbdlaksjdb");
        google.clickSearchLink();
        Assert.assertEquals("Title After Search=>",searchText+" - Google Search", google.clickSearchLink().getTitle());
    }

    @After
    public void cleanup(){
       aBrowser.close();
    }
}
