import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline mockFeline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(mockFeline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

    @Test
    public void testConstructor() {
        Cat cat = new Cat(mockFeline);
        assertNotNull(cat);
    }
}
