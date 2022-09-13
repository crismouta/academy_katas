import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {


    @Test
    public void turn_right() {
        MarsRover rover = new MarsRover();

        rover.setDirection();

        String result = rover.calculateDirection("R");

        assertEquals("E", result);

    }

    @Test
    public void turn_right_twice() {
        MarsRover rover = new MarsRover();

        rover.setDirection();

        String result = rover.calculateDirection("R");

        rover.setDirection();

        String result2 = rover.calculateDirection("R");

        assertEquals("S", result2);

    }

    @Test
    public void turn_right_from_north_to_east() {
        MarsRover rover = new MarsRover();

        assertEquals("E", rover.result("R"));

    }

    @Test
    public void turn_left_from_north_to_west() {
        MarsRover rover = new MarsRover();

        assertEquals("W", rover.result("L"));

    }


    @Test
    public void move_from_0_0_to_0_1() {
        MarsRover rover = new MarsRover();
        String [] commands = {"M"};

        assertEquals("0:1:N", rover.move(commands));

    }

    @Test
    public void move_from_0_0_to_0_2() {
        MarsRover rover = new MarsRover();
        String [] commands = {"M", "M"};

        assertEquals("0:2:N", rover.move(commands));

    }

    @Test
    public void move_from_0_0_to_0_3() {
        MarsRover rover = new MarsRover();
        String [] commands = {"M", "M", "M"};

        assertEquals("0:3:N", rover.move(commands));

    }

}
