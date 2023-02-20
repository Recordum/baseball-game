package baseballgameRefactorV2.util;

public enum ExceptionMessage {
    INVALID_RESULT_NUMBER("1또는 2를 눌러야 합니다."),
    INVALID_DIGITS_LENGTH("세자리 숫자만 입력 가능 합니다."),
    INVALID_DIGITS_DISTINCT("서로 다른 숫자만 입력 가능 합니다."),
    INVALID_DIGITS_RANGE("1에서 9까지 숫자만 입력 가능 합니다.");


    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String printMessage(){
        return this.message;
    }

}
