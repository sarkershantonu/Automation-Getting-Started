package org.automation.webtest.suits;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(CreateAccountFeatureTest.class)
@Suite.SuiteClasses({

})

public class GroupTestsSuite {
}
