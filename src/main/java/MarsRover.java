public class MarsRover {

    private PositionState positionState;
    private String position;
    private int xPosition = 0;
    private int yPosition = 0;

    public MarsRover() {
        this.position = new NorthState().getPosition();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public void setDirection() {
        switch (getPosition()) {
            case "N" -> positionState = new NorthState();
            case "W" -> positionState = new WestState();
            case "E" -> positionState = new EastState();
            case "S" -> positionState = new SouthState();
        }
    }

    public String calculateDirection(String turnType) {
        if (turnType.equals("R")) {
            setPosition(turnRight());
        }
        if (turnType.equals("L")) {
            setPosition(turnLeft());
        }
        return position;
    }

    public String result(String command){
        setDirection();
        return calculateDirection(command);
    }

    public String turnLeft() {
        return positionState.turnLeft();
    }

    public String turnRight() {
        return positionState.turnRight();
    }

    public String move(String [] commands) {
        for (String command:
             commands) {
            if(getPosition().equals("N")){
                yPosition++;
            }
        }
        return String.format("%d:%d:",xPosition,yPosition) + getPosition();
    }
}
