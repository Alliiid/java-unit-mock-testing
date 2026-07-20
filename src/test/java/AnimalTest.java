import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test(expected = Exception.class)
    public void testGetFoodInvalid() throws Exception {
        animal.getFood("Неизвестный вид");
    }

    @Test
    public void testGetFamily() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily());
    }
}