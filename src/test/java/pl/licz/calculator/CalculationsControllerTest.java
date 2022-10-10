package pl.licz.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class CalculationsControllerTest {

    @TestConfiguration
    static class CalculationsControllerTestImpl {
        @Bean
        public CalculationsController calculationsController() {
            return new CalculationsController();
        }
    }

    @Autowired
    private CalculationsController cc;
    int a;
    int b;

    @Test
    void addShouldReturn8() {
        a = 3;
        b = 5;
        int res = cc.add(a, b);
        assertEquals(8, res);
    }

    @Test
    void addShouldReturn1018() {
        a = 900;
        b = 118;
        int res = cc.add(a, b);
        assertEquals(1018, res);
    }

}