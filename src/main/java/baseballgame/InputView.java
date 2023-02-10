package baseballgame;


import java.io.IOException;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int view() {
        System.out.print("숫자를 입력해 주세요");
        int number = scanner.nextInt();
        while (!validatePitchingNumber(number)){
            System.out.println("세자리 숫자만 입력하세요");
            System.out.print("숫자를 입력해 주세요: ");
            number = scanner.nextInt();
        }

        return number;
    }

   public boolean validatePitchingNumber(int number) {
        if(number >= 100 && number < 1000){
            return true;
        }
        return false;
    }


}
