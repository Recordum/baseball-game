package baseballgameRefactorV2.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RefereeTest {

    @Test
    @DisplayName("낫싱 테스트")
    void judge_nothing(){
        Balls userBalls = new Balls(123);
        Balls answerBalls = new Balls(456);
        Referee referee = new Referee();

        Assertions.assertThat(referee.judge(userBalls,answerBalls)).usingRecursiveComparison().isEqualTo(new Result(0,0));;
    }
    @Test
    @DisplayName("1볼 테스트")
    void judge_1ball(){
        Balls userBalls = new Balls(123);
        Balls answerBalls = new Balls(416);
        Referee referee = new Referee();

        Assertions.assertThat(referee.judge(userBalls,answerBalls)).usingRecursiveComparison().isEqualTo(new Result(0,1));;
    }

    @Test
    @DisplayName("1스트라이크 1볼 테스트")
    void judge_1strike_1ball(){
        Balls userBalls = new Balls(126);
        Balls answerBalls = new Balls(416);
        Referee referee = new Referee();

        Assertions.assertThat(referee.judge(userBalls,answerBalls)).usingRecursiveComparison().isEqualTo(new Result(1,1));;
    }
}
