public class EastState implements PositionState{
    @Override
    public String turnLeft() {
        return "N";
    }

    @Override
    public String turnRight() {
        return "S";
    }

    @Override
    public String getPosition() {
        return "E";
    }
}
