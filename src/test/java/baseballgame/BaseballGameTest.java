package baseballgame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    @Test
    void replay() {
        BaseballGame baseballGame = new BaseballGame();
        Computer computer = new Computer();
        int answer = computer.answerGenerate();
        assertThat(baseballGame.replay(computer, 1)).isEqualTo(0);
        assertThat(baseballGame.replay(computer, 2)).isEqualTo(2);


    }
}