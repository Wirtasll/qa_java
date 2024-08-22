import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static junit.framework.Assert.assertEquals;


public class LionTest {
    @Rule public MockitoRule mockito = MockitoJUnit.rule();
    @Mock
    Lion lion;

    @Mock
    Feline feline;

    @Test
    public void lionMaleTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);

    }
    @Test
    public void lionFemaleTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        boolean expectedResult = false;
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void lionExceptionTest() {

        try {
            Lion lion = new Lion("Он", feline);
        }
        catch(Exception error) {
            String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(expectedResult, error.getMessage());
        }
    }
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        //Mockito.verify(lion).getKittens();

    }
    @Test
    public void getFoodLionTest() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, lion.getFood());
    }


}