package baseballgameRefactorV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ball {

    private List<PlaceValue> ball;

    private static final String  BALL_NO = "ballNo";
    private static final String  STRIKE_NO = "StrikeNo";

    private int ballNo = 0;
    private int strikeNo = 0;

    public Ball(Integer number) {
        ArrayList<PlaceValue> ball = setBall(number);
        this.ball = ball;
    }


    private static ArrayList<PlaceValue> setBall(Integer number) {

        String[] userBallUnit = String.valueOf(number).split("");
        ArrayList<PlaceValue> ball = new ArrayList<>();

        for (int i = 0; i < userBallUnit.length; i++) {
            ball.add(new PlaceValue(Integer.parseInt(userBallUnit[i]),i+1));
        }
        return ball;
    }
    public Map<String, Integer> countBallStatus(Ball userBall){
       
        Map<String, Integer> ballCountMap = new HashMap<>();
        for (PlaceValue answerValue : this.ball) {
            divideToPlaceValue(userBall, answerValue);
        }

        ballCountMap.put(BALL_NO,ballNo);
        ballCountMap.put(STRIKE_NO,strikeNo);

        return ballCountMap;
    }

    private void divideToPlaceValue(Ball userBall, PlaceValue answerValue) {
        userBall.ball.forEach(userValue -> comparePlaceValue(answerValue, userValue));
    }


    private void comparePlaceValue(PlaceValue answerValue, PlaceValue userValue) {

        if(compare(answerValue, userValue).isBall()){
            ballNo++;
        }
        if(compare(answerValue, userValue).isStrike()){
            strikeNo++;
        }
    }


    private static BallStatus compare(PlaceValue answerValue, PlaceValue userValue) {

       if(answerValue.isEqualValue(userValue)&& answerValue.isEqualPlace(userValue)){
           return BallStatus.STRIKE;
       }
       if(answerValue.isEqualValue(userValue)){
           return BallStatus.BALL;
       }
       return BallStatus.NOTHING;
    }
}

