package baseballgameRefactorV2.util;

public enum ConsoleMessage {
    NOTHING("낫싱"),
    STRIKE("스트라이크"),
    BALL("%d 볼"),
    STRIKE_BALL("%d 스트라이크, %d 볼"),
    CORRECT("정답 입니다");

    private final String message;
    ConsoleMessage(String message) {
        this.message = message;
    }

    public String printMessage(){
        return this.message;
    }
}
