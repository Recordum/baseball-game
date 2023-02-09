package baseballgame;

public class BaseballGame {

    private int answer;


    public BaseballGame() {
        this.answer = answerGenerate();
    }
    private int answerGenerate() {
        return (int)(Math.random() * 1000);
    }

}
