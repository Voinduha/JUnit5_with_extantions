package guru.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import guru.qa.domain.UserInfo;
import guru.qa.jupiter.User;

public class ParameterResolverTest {

    @DisplayName("ParameterResolverTest")
    @Test
    void first(TestInfo testInfo) {
        System.out.println(testInfo.toString());
    }

    @Test
    void second(@User UserInfo userInfo) {
        System.out.println(userInfo.toString());
    }
}
