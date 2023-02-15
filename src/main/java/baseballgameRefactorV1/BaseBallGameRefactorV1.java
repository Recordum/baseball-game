package baseballgameRefactorV1;



public class BaseBallGameRefactorV1 {

    public static void play(){
        Ball answer = AnswerGenerator.generator();
        GameStatus gameStatus = GameStatus.PROCESS;
        Result result;
        Referee referee = new Referee();

        while (gameStatus.isNotEnd()){

            Ball userBall = new Ball(InputView.inputNumber());
            result = referee.judge(answer,userBall);
            gameStatus = ResultView.viewResolver(result.returnView());
            answer = restartGame(answer, gameStatus);
        }
    }

    private static Ball restartGame(Ball answer, GameStatus gameStatus) {
        if(gameStatus.isReStart()){
            return answer = AnswerGenerator.generator();
        }
        return answer;
    }
}
