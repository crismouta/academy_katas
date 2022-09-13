public class SouthState implements PositionState{
    @Override
    public String turnLeft() {
        return "E";
    }

    @Override
    public String turnRight() {
        return "W";
    }

    @Override
    public String getPosition() {
        return "S";
    }
}
