package baseballgame;

public class Computer {
    private int answer;

    public Computer() {
        this.answer = answerGenerate();
    }

    public int answerGenerate() {
        int units;
        int tens;
        int hundreds;
        while (true){
            units = (int)(Math.random() * 10) + 0;
            tens = (int)(Math.random() * 10) + 0;
            hundreds = (int)(Math.random() * 9) + 1;
            if (isDifferPlaceValue(units, tens, hundreds)) {
                break;
            }
        }
        return units + 10 * tens + 100 * hundreds;
    }

    public boolean isDifferPlaceValue(int units, int tens, int hundreds) {
        if(units != tens && units != hundreds && hundreds != tens){
            return true;
        }
        return false;
    }

}
