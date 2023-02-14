package baseballgameRefactorV1;

import java.util.ArrayList;
import java.util.List;

public class Ball {

    private List<PlaceValue> ball;

    private static final int HUNDREDS = 0;
    private static final int TENS = 1;
    private static final int UNITS = 2;

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

    public int ballCount(Ball answer) {
       int count = 0;
       if(ball.get(HUNDREDS).isEqualValue(answer.ball.get(TENS))){
           count++;
       }
       if(ball.get(HUNDREDS).isEqualValue(answer.ball.get(UNITS))){
           count++;
       }
       if(ball.get(TENS).isEqualValue(answer.ball.get(HUNDREDS))){
           count++;
       }
       if(ball.get(TENS).isEqualValue(answer.ball.get(UNITS))){
           count++;
       }
       if(ball.get(UNITS).isEqualValue(answer.ball.get(TENS))){
           count++;
       }
       if(ball.get(UNITS).isEqualValue(answer.ball.get(HUNDREDS))){
           count++;
       }
       return count;
    }
    public int strikeCount(Ball answer) {
        int count = 0;
        if(ball.get(HUNDREDS).isEqualValue(answer.ball.get(HUNDREDS))){
            count++;
        }
        if(ball.get(TENS).isEqualValue(answer.ball.get(TENS))){
            count++;
        }
        if(ball.get(UNITS).isEqualValue(answer.ball.get(UNITS))){
            count++;
        }
        return count;
    }
}

