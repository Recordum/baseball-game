package baseballgameRefactorV2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Balls {

    private List<Integer> balls;
    private final int MIN_VALUE = 1;
    private final int DIGIT_LENGTH = 3;
    
    public Balls(int number) {
        this.balls = setBalls(number);
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
            throw new IllegalStateException("세자리 숫자만 입력 가능 합니다.");
        }
    }

    private void checkDuplicate(String[] digits) {
        boolean isDuplicate = Arrays.stream(digits)
                .distinct()
                .count() != DIGIT_LENGTH;

        if(isDuplicate){
            throw new IllegalStateException("서로 다른 숫자만 입력 가능 합니다.");
        }
    }

    private void checkDigitsValue(String[] digits) {
        Arrays.stream(digits)
                .filter(digit -> Integer.parseInt(digit) < MIN_VALUE)
                .forEach(digit -> {throw new IllegalStateException("1에서 9까지 숫자만 입력 가능 합니다.");});
    }


}
