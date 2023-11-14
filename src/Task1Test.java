import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test {


    @ParameterizedTest
    @ValueSource(ints = {7, 37, 41})

    public void evenFalse(int numb) {
        Task1 task1 = new Task1();
        assertFalse(task1.evenOddNumber(numb));

    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 8})

    public void evenTrue(int numb) {
        Task1 task1 = new Task1();
        assertTrue(task1.evenOddNumber(numb));

    }



}
