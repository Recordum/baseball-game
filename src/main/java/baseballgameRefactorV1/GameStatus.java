package baseballgameRefactorV1;

public enum GameStatus {
    RESTART,END, PROCESS;



    public boolean isReStart(){ return this == RESTART; }

    public boolean isNotEnd() {
        return this != END;
    }
}
