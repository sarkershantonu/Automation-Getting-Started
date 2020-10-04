package org.automation.webtest.tests.departments;


import org.automation.webtest.core.TestBase;
import org.automation.webtest.model.DepartmentParameter;
import org.automation.webtest.pages.singlepages.Department;
import org.automation.webtest.steps.singlepage.DepartmentSteps;
import org.junit.BeforeClass;
import org.junit.Test;

public class MealsTest extends TestBase {
    private static DepartmentParameter departmentParameter;
    private static Department departmentPage;
    private DepartmentSteps department;

    @BeforeClass
    public static void initTests(){
        departmentParameter = DepartmentParameter.getDepartmentParameter("pageType=browse&id=meals&pageSize=30&all=false&activePage=1&sortBy=null&orderAsc=false&activeTab=product&trk=gnav");
        departmentPage = new Department(browser);
        departmentPage.setURLParameter(departmentParameter);
        departmentPage.initStaticItems();
    }

    @Test
    public void mealsDepartment(){
        department = new DepartmentSteps(departmentPage);
        department.navigateTo();
        System.out.println(departmentPage.getTitle());
    }

}
