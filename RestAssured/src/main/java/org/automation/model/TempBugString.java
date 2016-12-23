package org.automation.model;

/**
 * Created by shantonu on 12/23/16.
 */
public class TempBugString {
    public static String getBugStringToAdd(){
        return " {\n" +
                "    \"title\": \"this is a New\",\n" +
                "    \"summary\": \"Sample Bug\",\n" +
                "    \"exceptions\": \"Exception Is not present\",\n" +
                "    \"comments\": \"Comments \",\n" +
                "    \"foundDateTime\": \"1st december\",\n" +
                "    \"tags\": \"New, On production\",\n" +
                "    \"priority\": \"High\",\n" +
                "    \"servility\": \"Blocker\",\n" +
                "    \"description\": \"Sampel Data \",\n" +
                "    \"attachmentPath\": \"http://\"\n" +
                "  }";
    }
    public static String getBugStringForModify(int id){
        final String modify = " {\n" +
                "    \"id\": "+Integer.toString(id)+",\n" +
                "    \"title\": \"this is a New\",\n" +
                "    \"summary\": \"Sample Bug\",\n" +
                "    \"exceptions\": \"Exception Is not present\",\n" +
                "    \"comments\": \"Comments \",\n" +
                "    \"foundDateTime\": \"1st december\",\n" +
                "    \"tags\": \"New, On production\",\n" +
                "    \"priority\": \"High\",\n" +
                "    \"servility\": \"Blocker\",\n" +
                "    \"description\": \"Sampel Data \",\n" +
                "    \"attachmentPath\": \"http://\"\n" +
                "  }";
        return modify;
    }

}
