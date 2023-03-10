package baseballgameRefactorV2.util;

public enum ConsoleMessage {
    NOTHING("낫싱"),
    STRIKE("%d 스트라이크"),
    BALL("%d 볼"),
    STRIKE_BALL("%d 스트라이크, %d 볼"),
    CORRECT("정답 입니다"),
    INPUT_MESSAGE("숫자를 입력해주세요."),
    RESULT_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

    private final String message;
    ConsoleMessage(String message) {
        this.message = message;
    }

    public String printMessage(){
        return this.message;
    }
}
