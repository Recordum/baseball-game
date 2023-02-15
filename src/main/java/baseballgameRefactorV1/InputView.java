package baseballgameRefactorV1;

import java.util.Scanner;

public class InputView {
    private static final int MIN_VAL = 100;
    private static final int MAX_VAL = 999;

    static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int number = scanner.nextInt();
        if(number<MIN_VAL || number>MAX_VAL){
            throw new IllegalStateException("세자리 숫자만 가능 합니다.");
        }
        return number;
    }

}
