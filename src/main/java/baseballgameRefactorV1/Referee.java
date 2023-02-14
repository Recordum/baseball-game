package baseballgameRefactorV1;

import java.util.ArrayList;

public class Referee {
    int strikeCount = 0;
    int ballCount = 0;

    public Result compare(Ball answer, Ball userball) {
        strikeCount = userball.strikeCount(answer);
        ballCount = userball.ballCount(answer);

        return new Result(strikeCount, ballCount);
    }
}
