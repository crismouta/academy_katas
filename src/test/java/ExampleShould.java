import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class ExampleShould {
    @Test
    public void return_true() {
        Example example = new Example();

        boolean result = example.isTrue();

        Assertions.assertEquals(true, result);
    }
}
