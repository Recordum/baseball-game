package baseballgameRefactorV2.model;

import baseballgameRefactorV2.util.ConsoleMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ResultTest {


    @Test
    @DisplayName("0스트라이크 0볼 일떄 낫싱을 반환한다")
    void view_nothing() {
        Result result = new Result(0,0);
        assertThat(result.view()).isEqualTo(ConsoleMessage.NOTHING.printMessage());
    }

    @Test
    @DisplayName("1스트라이크 일떄 결과")
    void view_1strike() {
        Result result = new Result(1,0);
        assertThat(result.view()).isEqualTo(String.format(ConsoleMessage.STRIKE.printMessage(),1));
    }

    @Test
    @DisplayName("1볼 일때 결과")
    void view_1ball() {
        Result result = new Result(0,1);
        assertThat(result.view()).isEqualTo(String.format(ConsoleMessage.BALL.printMessage(),1));
    }

    @Test
    @DisplayName("1스트라이크 1볼 일때 결과")
    void view_1strike_1ball() {
        Result result = new Result(1,1);
        assertThat(result.view()).isEqualTo(String.format(ConsoleMessage.STRIKE_BALL.printMessage(),1,1));
    }

    @Test
    @DisplayName("정답일떄 결과")
    void view_3strikes() {
        Result result = new Result(3,0);
        assertThat(result.view()).isEqualTo(String.format(ConsoleMessage.CORRECT.printMessage()));
    }

}
