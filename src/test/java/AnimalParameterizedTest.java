import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final Animal animal = new Animal();

    @Parameterized.Parameter
    public String animalKind;

    @Parameterized.Parameter(1)
    public List<String> expectedFood;

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }

    @Test
    public void testGetFoodValid() throws Exception {
        assertEquals(expectedFood, animal.getFood(animalKind));
    }
}
