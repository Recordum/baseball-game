package baseballgameRefactorV1;

public enum BallStatus {
    STRIKE,BALL,NOTHING;

    public boolean isBall(){
       return this == BallStatus.BALL;
    }

    public boolean isStrike(){
        return this == BallStatus.STRIKE;
    }
}


