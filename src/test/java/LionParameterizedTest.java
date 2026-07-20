import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final Feline mockFeline = org.mockito.Mockito.mock(Feline.class);

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean expectedHasMane;

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testLionCreationValid() throws Exception {
        Lion lion = new Lion(mockFeline, sex);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testLionCreationInvalid() throws Exception {
        new Lion(mockFeline, "Неизвестный пол");
    }
}
