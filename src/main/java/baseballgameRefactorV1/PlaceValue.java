package baseballgameRefactorV1;

public class PlaceValue {
    private int place;
    private int value;

    private static final int MAX_VALUE = 9;
    private static final int MIN_VALUE = 1;


    public PlaceValue(int value, int place) {
        if(value > MAX_VALUE || value < MIN_VALUE){
            throw new IllegalStateException("숫자는 1에서 9까지 숫자중 하나 여야 합니다");
        }

        this.value = value;
        this.place = place;
    }

    public boolean isEqualValue(PlaceValue placeValue){
        return value == placeValue.value;
    }

    public boolean isEqualPlace(PlaceValue placeValue){
        return place == placeValue.place;
    }
}
