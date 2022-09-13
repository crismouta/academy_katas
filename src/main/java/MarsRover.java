public class MarsRover {
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
        }
        return "0:0:"+position;

    }
}
