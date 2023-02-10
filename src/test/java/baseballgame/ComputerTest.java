package baseballgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ComputerTest {
    Computer computer = new Computer();

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

    @Test
    void isDifferPlaceValueTest() {
        assertThat(computer.isDifferPlaceValue(1,2,3)).isTrue();
        assertThat(computer.isDifferPlaceValue(1,1,1)).isFalse();
        assertThat(computer.isDifferPlaceValue(1,1,2)).isFalse();
        assertThat(computer.isDifferPlaceValue(1,2,1)).isFalse();
        assertThat(computer.isDifferPlaceValue(2,1,1)).isFalse();
    }

    @Test
    void comparePitchingToAnswerTest() {
        assertThat(computer.comparePitchingToAnswer(123,123)).isEqualTo("3개의 숫자를 모두 맞히셨습니다!");
        assertThat(computer.comparePitchingToAnswer(104,123)).isEqualTo("1스트라이크");
        assertThat(computer.comparePitchingToAnswer(124,142)).isEqualTo("2볼 1스트라이크");

    }

}