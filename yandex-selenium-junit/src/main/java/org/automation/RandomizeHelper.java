package org.automation;

import java.security.SecureRandom;

/**
 * Created by shantonu on 6/8/16.
 */
public class RandomizeHelper {
    public static Integer getInt(int a, int b){

        return new SecureRandom().nextInt(b-a+1)+a;
    }
}
