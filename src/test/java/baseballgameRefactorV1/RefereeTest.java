package baseballgameRefactorV1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RefereeTest {

    @Test
    @DisplayName("judge() 결과는 nothing")
    void judge_nothing(){
       Referee referee = new Referee();
       Ball answer = new Ball(123);
       Ball userBall = new Ball(456);

       assertThat(referee.judge(answer,userBall)).usingRecursiveComparison().isEqualTo(new Result(0,0));
    }

    @Test
    @DisplayName("judge() 결과는 1 ball")
    void judge_1ball(){
        Referee referee = new Referee();
        Ball answer = new Ball(123);
        Ball userBall = new Ball(436);

        assertThat(referee.judge(answer,userBall)).usingRecursiveComparison().isEqualTo(new Result(0,1));
    }
    @Test
    @DisplayName("judge() 결과는 1 ball 1 strike")
    void judge_1ball1strike(){
        Referee referee = new Referee();
        Ball answer = new Ball(423);
        Ball userBall = new Ball(436);

        assertThat(referee.judge(answer,userBall)).usingRecursiveComparison().isEqualTo(new Result(1,1));

    }
}
