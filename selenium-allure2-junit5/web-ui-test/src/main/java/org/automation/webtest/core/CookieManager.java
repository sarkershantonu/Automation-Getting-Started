package org.automation.webtest.core;

import org.openqa.selenium.Cookie;

import java.util.Set;

public class CookieManager {
    private CookieManager(){}

    public static void deleteAllCookies(){
        Browser.getInstance().manage().deleteAllCookies();
    }
    public static void deleteCookie(String name){
        Browser.getInstance().manage().deleteCookieNamed(name);
    }
    public static void deleteCookie(Cookie aCookie){
        Browser.getInstance().manage().deleteCookie(aCookie);
    }
    public static void addCookie(Cookie aCookie){
        Browser.getInstance().manage().addCookie(aCookie);
    }
    public static Set<Cookie> getAllCookie(){
        return Browser.getInstance().manage().getCookies();
    }
    public static Cookie getACookie(String name){
        return Browser.getInstance().manage().getCookieNamed(name);
    }
}
