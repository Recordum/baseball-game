package baseballgame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    Computer computer = new Computer();

    @DisplayName("answerGenerate 테스트")
    @Test
    void answerGenerateTest() {
        int answer = computer.answerGenerate();

        assertThat(answer).isLessThan(1000);
        assertThat(answer).isGreaterThan(99);

        int units = Integer.parseInt(String.valueOf(String.valueOf(answer).charAt(0)));
        int tens = Integer.parseInt(String.valueOf(String.valueOf(answer).charAt(1)));
        int hundreds = Integer.parseInt(String.valueOf(String.valueOf(answer).charAt(2)));

        assertThat(units).isNotEqualTo(tens);
        assertThat(units).isNotEqualTo(hundreds);
        assertThat(tens).isNotEqualTo(hundreds);
    }

}