package org.automation.pages.opencart;

/**
 * Created by shantonu on 8/23/17.
 */
public class OpenCartPageBase {
    public String title_css="h1";
    public String base_url =System.getProperty("host.protocol")+"://"+
            System.getProperty("app.host");//+":"+System.getProperty("host.port");

    protected String getLinkCSS(String link){

        return "a[href='"+link+"']";
    }
}
