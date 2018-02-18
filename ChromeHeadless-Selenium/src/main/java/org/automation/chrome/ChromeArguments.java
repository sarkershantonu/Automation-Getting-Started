package org.automation.chrome;



public class ChromeArguments {

    public static final String HEADLESS="headless";

    public static final String DISABLED_GPU="disable-gpu";

    public static String DEBUG_PORT="9222";

    public static String DEBUG="remote-debugging-port="+DEBUG_PORT;

    public static final  String JS_MODE="repl";

    public static String screen="1280,800";

    public static String RESOLUTION="window-size="+screen;

    public static final String PRINT_DOM="dump-dom";

    public static final String PRINT_PDF="print-to-pdf";

    public static String[] getDebuggingArguments(){

        return new String[] {HEADLESS,DEBUG};
    }

    public static String getCliOption(String arg){
        return "--"+arg;
    }
}
