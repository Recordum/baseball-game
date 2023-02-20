import baseballgame.BaseballGame;
import baseballgameRefactorV1.BaseBallGameRefactorV1;
import baseballgameRefactorV2.controller.BaseBallGameController;
import baseballgameRefactorV2.model.Referee;

public class application {
    public static void main(String[] args) {
        Referee referee = new Referee();
        BaseBallGameController baseBallGameController = new BaseBallGameController(referee);
//        BaseballGame baseballGame = new BaseballGame();
//
//        baseballGame.play();

//        BaseBallGameRefactorV1.play();
        baseBallGameController.play();

    }
}
