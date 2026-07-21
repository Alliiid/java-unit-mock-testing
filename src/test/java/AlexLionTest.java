import com.example.AlexLion;
import com.example.Feline;
import com.example.Lion;
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
    public void testGetFriendsContainsMarty() {
        List<String> friends = alex.getFriends();
        assertTrue(friends.contains("Марти"));
    }

    @Test
    public void testGetFriendsContainsGloria() {
        List<String> friends = alex.getFriends();
        assertTrue(friends.contains("Глория"));
    }

    @Test
    public void testGetFriendsContainsMelman() {
        List<String> friends = alex.getFriends();
        assertTrue(friends.contains("Мелман"));
    }

    @Test
    public void testGetFriendsSizeIsThree() {
        assertEquals(3, alex.getFriends().size());
    }

    @Test
    public void testGetPlaceOfLivingReturnsNewYorkZoo() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittensReturnsZero() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testGetFoodReturnsMeatList() throws Exception {
        when(mockFeline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, alex.getFood());
    }

    @Test
    public void testConstructorCreatesAlexLionSuccessfully() throws Exception {
        AlexLion anotherAlex = new AlexLion(mockFeline);
        assertNotNull(anotherAlex);
    }

    @Test
    public void testConstructorCreatesMaleLionWithMane() throws Exception {
        AlexLion anotherAlex = new AlexLion(mockFeline);
        assertTrue(anotherAlex.doesHaveMane());
    }
}