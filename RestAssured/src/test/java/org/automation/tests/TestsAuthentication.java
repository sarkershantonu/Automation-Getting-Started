package org.automation.tests;

import org.apache.http.HttpStatus;
import org.automation.core.BugTestBase;
import org.automation.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

/**
 * Created by SSarker on 8/4/2018.
 */
@RunWith(Parameterized.class)
public class TestsAuthentication extends BugTestBase {
    @Parameterized.Parameter
    public User credential;

    @Parameterized.Parameters(name = "{0}")
    public static Collection<User> credentials() {
        return Arrays.asList(new User[]{
                new User("", ""),
                new User("shantonu", "~!@#$%^")
        });
    }


    @Test
    public void testBadAuthentications() {
       given()
               .auth().basic(credential.getName(),credential.getPassword())
               .get().then().assertThat().statusCode(HttpStatus.SC_UNAUTHORIZED)
               .time(lessThan(globalResponseTimeout));
    }
}
