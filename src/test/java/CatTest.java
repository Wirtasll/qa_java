import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getVoiceTest(){
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);

        //Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = cat.getFood();
        assertEquals(expectedList, actualResult);
    }

}
