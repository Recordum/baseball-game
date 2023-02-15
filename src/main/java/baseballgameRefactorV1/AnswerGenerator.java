package baseballgameRefactorV1;

public class AnswerGenerator {

    public static Ball generator() {
        int units = (int)(Math.random() * 9) + 1;
        int tens = (int)(Math.random() * 9) + 1;
        int hundreds = (int)(Math.random() * 9) + 1;

        while (!isDifferPlaceValue(units, tens, hundreds)){
            units = (int)(Math.random() * 9) + 1;
            tens = (int)(Math.random() * 9) + 1;
            hundreds = (int)(Math.random() * 9) + 1;
        }
        return new Ball(units + 10 * tens + 100 * hundreds);
    }

    private static boolean isDifferPlaceValue(int units, int tens, int hundreds) {
        if(units != tens && units != hundreds && hundreds != tens){
            return true;
        }
        return false;
    }

}
