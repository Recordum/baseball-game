package baseballgameRefactorV1;


import java.util.Map;

public class Referee {
    private int strikeNo = 0;
    private int ballNo = 0;

    private static final String  BALL_NO = "ballNo";
    private static final String  STRIKE_NO = "StrikeNo";

    public Result judge(Ball answer, Ball userBall){

        Map<String, Integer> ballCountMap = mapBallStatusCount(answer, userBall);

        strikeNo = ballCountMap.get(STRIKE_NO);
        ballNo = ballCountMap.get(BALL_NO);

        return new Result(strikeNo, ballNo);
    }

    private static Map<String, Integer> mapBallStatusCount(Ball answer, Ball userBall) {
        return userBall.countBallStatus(answer);
    }

}
