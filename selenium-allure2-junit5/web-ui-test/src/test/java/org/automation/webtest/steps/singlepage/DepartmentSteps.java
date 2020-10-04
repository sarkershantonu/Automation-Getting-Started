package org.automation.webtest.steps.singlepage;

import org.automation.webtest.pages.singlepages.Department;
import org.automation.webtest.steps.StepBase;
import ru.yandex.qatools.allure.annotations.Step;


public class DepartmentSteps extends StepBase {

    private Department page;

    public DepartmentSteps(Department page){
        this.page = page;
    }

    @Step
    public void navigateTo(){
        navigate(page.pageUrl);
    }
}
