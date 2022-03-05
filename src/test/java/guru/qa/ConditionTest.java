package guru.qa;

import org.junit.jupiter.api.Test;
import guru.qa.jupiter.OnlyProdEnv;

public class ConditionTest {

    @Test
    void first() {

    }

    @OnlyProdEnv
    @Test
    void second() {

    }
}
