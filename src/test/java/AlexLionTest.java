import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    private Feline mockFeline;

    private AlexLion alex;

    @Before
    public void setUp() throws Exception {
        alex = new AlexLion(mockFeline);
    }

    @Test
    public void testAlexLionHasMane() {
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void testGetFriends() {
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
        assertEquals(3, alex.getFriends().size());
    }

    @Test
    public void testGetPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(mockFeline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, alex.getFood());
    }

    @Test
    public void testConstructor() throws Exception {
        AlexLion anotherAlex = new AlexLion(mockFeline);
        assertNotNull(anotherAlex);
        assertTrue(anotherAlex.doesHaveMane());
    }

}