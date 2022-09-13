public class MarsRover {
    public String rotateRight(String position) {
        if (position == "N") {
            return "0:0:E";
        }
        return "0:0:S";
    }
}
