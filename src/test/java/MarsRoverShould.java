import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

    @ParameterizedTest
    @CsvSource({
            "N, '0:0:E'",
            "E, '0:0:S'",
            "S, '0:0:W'",
            "W, '0:0:N'"
    })
    public void turn_right(String position, String expectedCoordinates) {
        MarsRover rover = new MarsRover();

        String result = rover.rotateRight(position);

        assertEquals(expectedCoordinates, result);
    }

    @ParameterizedTest
    @CsvSource({
            "N, '0:0:W'",
            "E, '0:0:N'",
            "S, '0:0:E'",
            "W, '0:0:S'"
    })
    public void turn_left(String position, String expectedCoordinates) {
        MarsRover rover = new MarsRover();

        String result = rover.rotateLeft(position);

        assertEquals(expectedCoordinates, result);
    }

    @Test
    public void turn_right() {
        MarsRover rover = new MarsRover();

        String result = rover.calculateDirection("R");

        assertEquals("E", result);

    }

}
