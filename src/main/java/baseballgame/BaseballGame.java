package baseballgame;

public class BaseballGame {

    private int answer;

    public void play() {
        Computer computer = new Computer();
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        
        int result = 0;
        this.answer = computer.answerGenerate();

        while (result == 0 ){
            int pitching = inputView.view();
            String compareResult = computer.comparePitchingToAnswer(pitching,answer);
            result = resultView.view(compareResult);
            result = replay(computer,result);
        }


    }

    public int replay(Computer computer, int result) {
        if(result == 1){
            this.answer = computer.answerGenerate();
            return result = 0;
        }
        return result;
    }

}
