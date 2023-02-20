package baseballgameRefactorV2.model;

import baseballgameRefactorV2.util.ConsoleMessage;

public class Result {

    private int numberOfStrikes = 0;
    private int numberOfBalls = 0;

    private static final int NONE = 0;
    private static final int CORRECT = 3;

    public Result(int numberOfStrikes, int numberOfBalls) {
        this.numberOfStrikes = numberOfStrikes;
        this.numberOfBalls = numberOfBalls;
    }

    public String view() {
        if(numberOfStrikes == CORRECT){
            return String.format(ConsoleMessage.CORRECT.printMessage());
        }
        if(numberOfStrikes != NONE && numberOfBalls == NONE) {
            return String.format(ConsoleMessage.STRIKE.printMessage(),numberOfStrikes);
        }
        if(numberOfStrikes == NONE && numberOfBalls != NONE) {
            return String.format(ConsoleMessage.BALL.printMessage(),numberOfBalls);
        }
        if(numberOfStrikes != NONE && numberOfBalls != NONE) {
            return String.format(ConsoleMessage.STRIKE_BALL.printMessage(),numberOfStrikes,numberOfBalls);
        }
        return ConsoleMessage.NOTHING.printMessage();
    }
}
