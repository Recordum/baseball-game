package baseballgameRefactorV2.view;

import baseballgameRefactorV2.util.ConsoleMessage;

import java.util.Scanner;

public class InputView {
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleMessage.INPUT_MESSAGE.printMessage());
        int userBalls = scanner.nextInt();

        return userBalls;
    }
}
