import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class FizzBuzzShould {
    /*@Test
    public void convert_1_to_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(1);

        assertEquals("1", result);
    }

    @Test
    public void convert_2_to_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(2);

        assertEquals("2", result);
    }

    @Test
    public void convert_4_to_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(4);

        assertEquals("4", result);
    }*/

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "4,4"
    })
    void convert_number_to_FizzBuzz_string(int input, String expectedOutput) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(input);
        assertEquals(expectedOutput, result);
    }

}
