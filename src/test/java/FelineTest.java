import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {


    @Test
    public void eatMeatAnimalTest() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();

        assertEquals("Животные", actualFoodTypes.get(0));
    }
    @Test
    public void eatMeatBirdsTest() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();

        assertEquals("Птицы", actualFoodTypes.get(1));
    }
    @Test
    public void eatMeatFishTest() throws Exception {
        Feline feline = new Feline();

        List<String> actualFoodTypes = feline.eatMeat();

        assertEquals("Рыба", actualFoodTypes.get(2));

    }

    @Test
    public void getKittensReturnTest() {
        Feline feline = new Feline();
        assertEquals(-1, feline.getKittens(-1));

    }
    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, feline.getFamily());
    }
}
