package baseballgame;

public class Computer {

    public int answerGenerate() {
        int units = (int)(Math.random() * 10) + 0;
        int tens = (int)(Math.random() * 10) + 0;
        int hundreds = (int)(Math.random() * 9) + 1;

        while (!isDifferPlaceValue(units, tens, hundreds)){
            units = (int)(Math.random() * 10) + 0;
            tens = (int)(Math.random() * 10) + 0;
            hundreds = (int)(Math.random() * 9) + 1;
        }
        return units + 10 * tens + 100 * hundreds;
    }

    public boolean isDifferPlaceValue(int units, int tens, int hundreds) {
        if(units != tens && units != hundreds && hundreds != tens){
            return true;
        }
        return false;
    }
    public String comparePitchingToAnswer(int pitching, int answer) {

        char pitchingUnits = String.valueOf(pitching).charAt(0);
        char pitchingTens = String.valueOf(pitching).charAt(1);
        char pitchingHundreds = String.valueOf(pitching).charAt(2);

        char answerUnits = String.valueOf(answer).charAt(0);
        char answerTens = String.valueOf(answer).charAt(1);
        char answerHundreds = String.valueOf(answer).charAt(2);

        return judgingStrikeOrBall(pitchingUnits,pitchingTens,pitchingHundreds,answerUnits,answerTens,answerHundreds);
    }
    public String judgingStrikeOrBall(char pitchingUnits, char pitchingTens, char pitchingHundreds, char answerUnits, char answerTens, char answerHundreds) {
        int strikeCount = 0;
        int ballCount = 0;

        if(pitchingUnits == answerUnits){
            strikeCount++;
        }
        if(pitchingUnits == answerTens || pitchingUnits == answerHundreds){
            ballCount++;
        }
        if(pitchingTens == answerTens){
            strikeCount++;
        }
        if(pitchingTens == answerUnits || pitchingTens == answerHundreds){
            ballCount++;
        }
        if(pitchingHundreds == answerHundreds){
            strikeCount++;
        }
        if(pitchingHundreds == answerUnits || pitchingHundreds == answerTens){
            ballCount++;
        }

        if(strikeCount == 3){
            return "3개의 숫자를 모두 맞히셨습니다!";
        }
        if(strikeCount == 0 && ballCount > 0){
            return ballCount + "볼";
        }
        if(ballCount == 0 && strikeCount > 0){
            return strikeCount + "스트라이크";
        }
        if(ballCount > 0 && strikeCount > 0){
            return ballCount + "볼" + " " + strikeCount + "스트라이크";
        }

        return "낫싱";
    }



}
