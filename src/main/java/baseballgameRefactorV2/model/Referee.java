package baseballgameRefactorV2.model;

public class Referee {
    private static final int DIGIT_LENGTH = 3;
    private int numberOfStrikes = 0;
    private int numberOfBalls = 0;
    public Result judge(Balls userBalls, Balls answerBalls) {
        for(int currentDigit = 0; currentDigit < DIGIT_LENGTH ; currentDigit++) {
           countStrikeNumber(userBalls, answerBalls, currentDigit) ;
           countBallNumber(userBalls, answerBalls, currentDigit);
        }

        return new Result(numberOfStrikes, numberOfBalls);
    }
    private void countStrikeNumber(Balls userBalls, Balls answerBalls, int digit) {
        if (userBalls.isStrike(answerBalls, digit)) {
            this.numberOfStrikes++;
        }
    }
    private void countBallNumber(Balls userBalls, Balls answerBalls, int digit) {
        if (userBalls.isBall(answerBalls, digit)) {
            this.numberOfBalls++;
        }
    }
}
