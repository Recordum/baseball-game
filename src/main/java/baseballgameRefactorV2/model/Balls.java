package baseballgameRefactorV2.model;

import baseballgameRefactorV2.util.ExceptionMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Balls {

    private List<Integer> ballValues;
    private static final int MIN_VALUE = 1;
    private static final int DIGIT_LENGTH = 3;
    
    public Balls(int number) {
        this.ballValues = setBalls(number);
    }

    private List<Integer> setBalls(int number) {
        String[] digits = validate(number);
        List<Integer> balls = new ArrayList<>();
        for (String digit : digits) {
            balls.add(Integer.parseInt(digit));
        }
        return balls;
    }

    private String[] validate(int number) {
        String[] digits = String.valueOf(number).split("");
        checkDigitsLength(digits);
        checkDuplicate(digits);
        checkDigitsValue(digits);
        return digits;
    }
    private void checkDigitsLength(String[] digits) {
        if(digits.length!= DIGIT_LENGTH){
            throw new IllegalStateException(ExceptionMessage.INVALID_DIGITS_LENGTH.printMessage());
        }
    }

    private void checkDuplicate(String[] digits) {
        boolean isDuplicate = Arrays.stream(digits)
                .distinct()
                .count() != DIGIT_LENGTH;

        if(isDuplicate){
            throw new IllegalStateException(ExceptionMessage.INVALID_DIGITS_DISTINCT.printMessage());
        }
    }

    private void checkDigitsValue(String[] digits) {
        Arrays.stream(digits)
                .filter(digit -> Integer.parseInt(digit) < MIN_VALUE)
                .forEach(digit -> {throw new IllegalStateException(ExceptionMessage.INVALID_DIGITS_RANGE.printMessage());});
    }

    public boolean isStrike(Balls answerBalls, int digit) {
       return this.ballValues.get(digit) == answerBalls.ballValues.get(digit);
    }

    public boolean isBall(Balls answerBalls, int digit) {
        return answerBalls.ballValues.contains(this.ballValues.get(digit)) && !this.isStrike(answerBalls,digit);
    }
}
