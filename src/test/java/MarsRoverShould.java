import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @Test
    public void turn_right() {
        MarsRover rover = new MarsRover();

        String result = rover.rotateRight("N");

        assertEquals("0:0:E", result);
    }

    @Test
    public void turn_right_twice() {
        MarsRover rover = new MarsRover();

        String result = rover.rotateRight("E");

        assertEquals("0:0:S", result);
    }

    @Test
    public void turn_right_from_south_to_west() {
        MarsRover rover = new MarsRover();

        String result = rover.rotateRight("S");

        assertEquals("0:0:W", result);
    }
}
