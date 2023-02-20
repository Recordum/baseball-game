package baseballgameRefactorV2.controller;


import baseballgameRefactorV2.model.Balls;
import baseballgameRefactorV2.model.Referee;
import baseballgameRefactorV2.model.Result;
import baseballgameRefactorV2.util.GameStatus;
import baseballgameRefactorV2.view.InputView;
import baseballgameRefactorV2.view.ResultView;

import java.util.Random;

public class BaseBallGameController {
    private static final int MAX_NUM = 999;
    private static final int MIN_NUM = 100;

    private Balls answerBalls = answerGenerator();
    private Referee referee;

    public BaseBallGameController(Referee referee) {
        this.referee = referee;
    }

    public void play() {

        GameStatus gameStatus = GameStatus.ON_GOING;

        while (gameStatus.isNotFinish()) {
            Balls userBalls = new Balls(InputView.input());
            Result result = referee.judge(userBalls,answerBalls);
            gameStatus = ResultView.viewResolver(result.view());
            this.answerBalls = restartOrFinish(gameStatus);
        }
    }

    private Balls restartOrFinish(GameStatus gameStatus) {
        if(gameStatus.isRestart()){
            this.answerBalls = answerGenerator();
        }
        return answerBalls;
    }

    private Balls answerGenerator() {
        Random random = new Random();
        int range = MAX_NUM - MIN_NUM;
        while (true) {
            try {
                return new Balls(random.nextInt(range) + MIN_NUM);
            } catch (IllegalStateException e) {

            }
        }
    }
}
