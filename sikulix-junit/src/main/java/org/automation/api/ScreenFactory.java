import org.sikuli.script.Screen;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by sarkers on 4/15/2016.
 */
public class ScreenFactory {
    private static Screen aScreen = null;
    @Step
    public static Screen getScreen(){
        if(aScreen==null){
            aScreen = new Screen();
        }
        return aScreen;
    }
    @Step
    public static void exit(){
        aScreen=null;
    }
}
