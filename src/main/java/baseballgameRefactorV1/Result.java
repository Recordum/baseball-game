package baseballgameRefactorV1;

import java.util.HashMap;
import java.util.Map;

public class Result {

    private int strikeCount;
    private int ballCount;

    public Result(int strikeCount, int ballCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public String returnView(){
        if(strikeCount == 3){
            return "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
        }
        if(strikeCount == 0 && ballCount == 0){
            return "낫싱";
        }
        if(strikeCount == 0){
            return ballCount + "볼 입니다.";
        }
        if(ballCount == 0){
            return strikeCount + "스트라이크 입니다.";
        }
        return ballCount + "볼 " + strikeCount + "스트라이크 입니다.";
    }
}
