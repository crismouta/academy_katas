public class MarsRover {

    private PositionState positionState;

    private String position;

    public MarsRover() {
        this.position = new NorthState().getPosition();
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public PositionState getPositionState() {
        return positionState;
    }
    public void setPositionState(PositionState positionState) {
        this.positionState = positionState;
    }

    public void setDirection(){
        if(getPosition().equals("N")) positionState = new NorthState();
        else if(getPosition().equals("W")) positionState = new WestState();
        else if(getPosition().equals("E")) positionState = new EastState();
        else if(getPosition().equals("W")) positionState = new SouthState();
    }

    public String calculateDirection(String turnType) {
        if (turnType.equals("R")) {
            setPosition(turnRight());
            setDirection();
        }
        if (turnType.equals("L")) {
            setPosition(turnLeft());
            setDirection();
        }
        return position;
    }
    public String turnLeft() {
        return positionState.turnLeft();
    }

    public String turnRight() {
        return positionState.turnRight();
    }

    public String rotateRight(String position) {
        if (position.equals("N")) {
            return "0:0:E";
        }
        if (position.equals("E")) {
            return "0:0:S";
        }
        if (position.equals("S")) {
            return "0:0:W";
        }
        return "0:0:N";
    }

    public String rotateLeft(String position) {
        switch (position){
            case "N": position = "W";
            break;
            case "E": position = "N";
            break;
            case "S": position = "E";
            break;
            case "W": position = "S";
            break;

        }
        return "0:0:"+position;

    }
}
