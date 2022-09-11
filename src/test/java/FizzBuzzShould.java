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
            "4,4",
            "3, 'Fizz'",
            "6, 'Fizz'",
            "9, 'Fizz'",
            "5, 'Buzz'",
            "10, 'Buzz'",
            "15, 'FizzBuzz'",
            "30, 'FizzBuzz'",

    })
    void convert_number_to_FizzBuzz_string(int input, String expectedOutput) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(input);

        assertEquals(expectedOutput, result);
    }


    /*@Test
    public void convert_number_3_to_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(3);

        assertEquals("Fizz", result);

    }

    @Test
    public void convert_number_6_to_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(6);

        assertEquals("Fizz", result);

    }

    @Test
    public void convert_number_9_to_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(9);

        assertEquals("Fizz", result);

    }*/

    /*@Test
    public void convert_number_5_to_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(5);

        assertEquals("Buzz", result);

    }

    @Test
    public void convert_number_10_to_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(10);

        assertEquals("Buzz", result);

    }*/

    /*@Test
    public void convert_number_15_to_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(15);

        assertEquals("FizzBuzz", result);

    }*/

}
