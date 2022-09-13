public class WestState implements PositionState{
    @Override
    public String turnLeft() {
        return "S";
    }

    @Override
    public String turnRight() {
        return "N";
    }

    @Override
    public String getPosition() {
        return "W";
    }
}
