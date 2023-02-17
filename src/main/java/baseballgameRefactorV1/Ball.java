package baseballgameRefactorV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ball {

    private List<PlaceValue> ball;

    private static final String BALL_NO = "ballNo";
    private static final String STRIKE_NO = "strikeNo";

    public Ball(Integer number) {
        this.ball = setBall(number);
    }

    private List<PlaceValue> setBall(Integer number) {
        String[] userBallUnit = String.valueOf(number).split("");
        List<PlaceValue> ball = new ArrayList<>();
        for (int i = 0; i < userBallUnit.length; i++) {
            ball.add(new PlaceValue(Integer.parseInt(userBallUnit[i]), i + 1));
        }
        return ball;
    }

    public Map<String, Integer> countBallStatus(Ball userBall) {
        int ballNo = countBalls(userBall);
        int strikeNo = countStrikes(userBall);

        Map<String, Integer> ballCountMap = new HashMap<>();
        ballCountMap.put(BALL_NO, ballNo);
        ballCountMap.put(STRIKE_NO, strikeNo);

        return ballCountMap;
    }

    private int countBalls(Ball userBall) {
        return (int) ball.stream()
                .filter(answerValue -> userBall.ball.stream()
                        .anyMatch(userValue -> isBall(answerValue, userValue)))
                .count();
    }

    private int countStrikes(Ball userBall) {
        return (int) ball.stream()
                .filter(answerValue -> userBall.ball.stream()
                        .anyMatch(userValue -> isStrike(answerValue, userValue)))
                .count();
    }

    private boolean isBall(PlaceValue answerValue, PlaceValue userValue) {
        return !answerValue.isEqualPlace(userValue) && answerValue.isEqualValue(userValue);
    }

    private boolean isStrike(PlaceValue answerValue, PlaceValue userValue) {
        return answerValue.isEqualPlace(userValue) && answerValue.isEqualValue(userValue);
    }

    private List<PlaceValue> ball() {
        return ball;
    }
}