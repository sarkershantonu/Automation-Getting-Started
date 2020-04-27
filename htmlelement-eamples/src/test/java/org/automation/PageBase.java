package org.automation;

import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by shantonu on 6/8/16.
 */
public abstract class PageBase {

    protected String name;
    private PageBase(){}
    public PageBase(String name){
        this.name=name;
        init(this);
    }
    protected static void init(PageBase page){
        HtmlElementLoader.populatePageObject(page, Browser.getInstance());
    }
}
