package baseballgameRefactorV2.util;

public enum GameStatus {
    FINISH,
    ON_GOING,
    RESTART;

    public boolean isRestart(){
        return this == RESTART;
    }

    public boolean isNotFinish(){
        return this == ON_GOING || this == RESTART;
    }
}
