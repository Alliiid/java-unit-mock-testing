import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline mockFeline;

    @Test
    public void testGetKittensReturnsThreeFromFeline() throws Exception {
        when(mockFeline.getKittens()).thenReturn(3);
        Lion lion = new Lion(mockFeline, "Самец");
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testGetFoodReturnsMeatListFromFeline() throws Exception {
        when(mockFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(mockFeline, "Самец");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testMaleLionHasMane() throws Exception {
        Lion lion = new Lion(mockFeline, "Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testFemaleLionHasNoMane() throws Exception {
        Lion lion = new Lion(mockFeline, "Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testConstructorThrowsExceptionForInvalidSex() throws Exception {
        new Lion(mockFeline, "Неизвестный пол");
    }
}