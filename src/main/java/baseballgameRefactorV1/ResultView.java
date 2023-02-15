package baseballgameRefactorV1;

import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public class ResultView {
    private static final int RESTART = 1;
    private static final int END = 2;

    public static GameStatus viewResolver(String view){

        System.out.println(view);
        if (view.equals("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")) {

            Scanner scanner = new Scanner(System.in);
            int gameStatus = scanner.nextInt();

            return getGameStatus(gameStatus);
        }
        return GameStatus.PROCESS;
    }

    private static GameStatus getGameStatus(int gameStatus) {
        if (gameStatus == RESTART) {
            return GameStatus.RESTART;
        }
        if (gameStatus == END) {
            return GameStatus.END;
        }
        return GameStatus.END;
    }
}
