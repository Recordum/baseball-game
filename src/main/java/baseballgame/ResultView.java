package baseballgame;

import java.util.Scanner;

public class ResultView {

    Scanner scanner = new Scanner(System.in);

    public int view(String result) {
        System.out.print(result);
        if(result.equals("3개의 숫자를 모두 맞히셨습니다!")){
            System.out.println(" 게임 종료");
            System.out.println("게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요");
            return scanner.nextInt();
        }
        System.out.println("");
        return 0;
    }
}
