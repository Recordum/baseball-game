package baseballgame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    InputView inputView = new InputView();


    @Test
    void validatePitchingNumber() {
        assertThat(inputView.validatePitchingNumber(100)).isTrue();
        assertThat(inputView.validatePitchingNumber(500)).isTrue();
        assertThat(inputView.validatePitchingNumber(1000)).isFalse();
        assertThat(inputView.validatePitchingNumber(99)).isFalse();
    }
}