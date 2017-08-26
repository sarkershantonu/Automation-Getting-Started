package org.automation.core;

/**
 * Created by shantonu on 8/23/17.
 */
public abstract class PageBase {
    public String title_css="h1";
    public String base_url =System.getProperty("host.protocol")+"://"+
            System.getProperty("app.host")+":"+System.getProperty("host.port");

}
