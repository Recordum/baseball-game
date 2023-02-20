package baseballgameRefactorV2.model;

import baseballgameRefactorV2.util.ConsoleMessage;

public class Result {

    private int numberOfStrikes = 0;
    private int numberOfBalls = 0;

    public Result(int numberOfStrikes, int numberOfBalls) {
        this.numberOfStrikes = numberOfStrikes;
        this.numberOfBalls = numberOfBalls;
    }

    public String view() {
        if(numberOfStrikes != 0 && numberOfBalls == 0) {
            return String.format(ConsoleMessage.STRIKE.printMessage(),numberOfStrikes);
        }
        if(numberOfStrikes == 0 && numberOfBalls != 0) {
            return String.format(ConsoleMessage.BALL.printMessage(),numberOfBalls);
        }
        if(numberOfStrikes != 0 && numberOfBalls != 0) {
            return String.format(ConsoleMessage.STRIKE_BALL.printMessage(),numberOfStrikes,numberOfBalls);
        }
        return ConsoleMessage.NOTHING.printMessage();
    }
}
