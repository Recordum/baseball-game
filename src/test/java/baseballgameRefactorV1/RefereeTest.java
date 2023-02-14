package baseballgameRefactorV1;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class RefereeTest {

    @Test
    void nothing(){
        Ball ball = new Ball(456);
        Ball answer = new Ball(123);
        Referee referee = new Referee();
        assertThat(referee.compare(answer, ball).result()).isEqualTo("낫싱");
    }

    @Test
    void ball(){
        Ball ball = new Ball(456);
        Ball answer = new Ball(165);
        Referee referee = new Referee();
        assertThat(referee.compare(answer, ball).result()).isEqualTo("2볼 입니다.");
    }
    @Test
    void Strike(){
        Ball ball = new Ball(156);
        Ball answer = new Ball(165);
        Referee referee = new Referee();
        assertThat(referee.compare(answer, ball).result()).isEqualTo("2볼 1스트라이크 입니다.");
    }
}
