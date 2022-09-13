public class NorthState implements PositionState {

    @Override
    public String turnLeft() {
        return "W";
    }

    @Override
    public String turnRight() {
        return "E";
    }

    @Override
    public String getPosition() {
        return "N";
    }
}
