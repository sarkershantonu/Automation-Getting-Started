package org.automation;

import org.automation.PageBase;

/**
 * Created by shantonu on 6/4/16.
 */
public interface CompletePage {
    String getUrl();
    PageBase load();
}
