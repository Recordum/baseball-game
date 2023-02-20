package baseballgameRefactorV2.view;

import baseballgameRefactorV2.util.ConsoleMessage;
import baseballgameRefactorV2.util.ExceptionMessage;
import baseballgameRefactorV2.util.GameStatus;

import java.util.Scanner;

public class ResultView {

    private static final int RESTART = 1;
    private static final int END = 2;

    public static GameStatus viewResolver(String view){
        Scanner scanner = new Scanner(System.in);
        int gameStatus = 0;
        System.out.println(view);
        if(view.equals(ConsoleMessage.CORRECT.printMessage())){

            System.out.println(ConsoleMessage.RESULT_MESSAGE.printMessage());
            gameStatus = scanner.nextInt();

            return restartOrFinish(gameStatus);
        }
        return GameStatus.ON_GOING;
    }

    private static GameStatus restartOrFinish(int gameStatus) {
        if(gameStatus == RESTART){
            return GameStatus.RESTART;
        }
        if(gameStatus == END){
            return GameStatus.FINISH;
        }

        throw new IllegalStateException(ExceptionMessage.INVALID_RESULT_NUMBER.printMessage());
    }
}
