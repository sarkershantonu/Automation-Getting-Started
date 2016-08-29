package org.automation.customtype;

import java.util.List;

/**
 * Created by shantonu on 8/28/16.
 */
public interface MyDataService {
    public List<MyDataType> getAll(String searchText);
    public MyDataType get(Long id);
}
