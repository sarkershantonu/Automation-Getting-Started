package org.automation;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shantonu on 6/8/16.
 */
public class RandomizeHelper {
    public static Integer getInt(int a, int b){

        return new SecureRandom().nextInt(b-a+1)+a;
    }

    public static <T> T getRandomItem(List<T> items){
        int max = items.size()-1;
        int random = getInt(0,max).intValue();
        return items.get(random);
    }
}
