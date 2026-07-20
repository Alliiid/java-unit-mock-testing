import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCount() {
        assertEquals(0, feline.getKittens(0));
        assertEquals(3, feline.getKittens(3));
        assertEquals(5, feline.getKittens(5));
        assertEquals(10, feline.getKittens(10));
    }
}
