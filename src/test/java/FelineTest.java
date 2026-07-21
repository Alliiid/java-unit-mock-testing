import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void testEatMeatReturnsMeatList() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensDefaultReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithZeroReturnsZero() {
        assertEquals(0, feline.getKittens(0));
    }

    @Test
    public void testGetKittensWithThreeReturnsThree() {
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void testGetKittensWithFiveReturnsFive() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void testGetKittensWithTenReturnsTen() {
        assertEquals(10, feline.getKittens(10));
    }
}