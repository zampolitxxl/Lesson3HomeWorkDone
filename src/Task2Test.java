import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2Test {

    @ParameterizedTest
    @ValueSource(ints = {25, 100,  200})

    public void intervalFalse(int numb) {
        Task2 task2 = new Task2();
        assertFalse(task2.numberInInterval(numb));

    }


    @ParameterizedTest
    @ValueSource(ints = {26, 50,  99})

    public void intervalTrue(int numb) {
        Task2 task2 = new Task2();
        assertTrue(task2.numberInInterval(numb));

    }

}
