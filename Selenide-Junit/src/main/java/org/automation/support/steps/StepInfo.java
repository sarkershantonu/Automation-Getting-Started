package org.automation.support.steps;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by shantonu on 9/15/17.
 */
public class StepInfo {
    public String method_name;
    public List<ParamInfo> parameters;

    @Override
    public String toString() {
        String info = "method_name= " + method_name +",\nparameters= ";

        for(ParamInfo item : parameters){
            info+=item.toString()+",";
        }

        return info;
    }
}
