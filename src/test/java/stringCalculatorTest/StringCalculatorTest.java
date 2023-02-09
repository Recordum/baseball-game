package stringCalculatorTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import stringCalculator.StringCalculator;

import static org.assertj.core.api.Assertions.*;


class StringCalculatorTest {
    StringCalculator stringCalculator= new StringCalculator();

    @Test
    void initParamTest() {
        stringCalculator.initParam("2 + 3 * 4 / 2");
        assertThat(stringCalculator.getElement()).containsExactly("2", "+", "3", "*", "4", "/", "2");
    }

    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2", "2 + 4 + 4", "1 + 1 + 10 * 2 - 14"})
    void calculateTest(String formula) {
        assertThat(stringCalculator.calculate(formula)).isEqualTo(10);
    }


}