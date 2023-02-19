package baseballgameRefactorV2;

import baseballgameRefactorV2.model.Balls;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class BallsTest {

    @Test
    @DisplayName("자릿수가 세자리인지 검증 테스트")
    void validate_checkDigitsLength(){
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> {
                    new Balls(9128);
                });
    }

    @Test
    @DisplayName("숫자 중복 검증 테스트")
    void validate_checkDuplicate(){
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> {
                    new Balls(992);
                });
    }



    @Test
    @DisplayName("각 자리수 크기가 1~9까지 숫자 인지 검증 테스트")
    void validate_checkDigitsValue(){
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> {
                    new Balls(910);
                });
    }

}
