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
    public void testGetKittens() throws Exception {
        when(mockFeline.getKittens()).thenReturn(3);
        Lion lion = new Lion(mockFeline, "Самец");
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(mockFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(mockFeline, "Самец");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testDoesHaveManeForMale() throws Exception {
        Lion lion = new Lion(mockFeline, "Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testDoesHaveManeForFemale() throws Exception {
        Lion lion = new Lion(mockFeline, "Самка");
        assertFalse(lion.doesHaveMane());
    }
}
