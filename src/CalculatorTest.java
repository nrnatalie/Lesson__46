import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;


public class CalculatorTest {

  @Test
  // public void Add_2Plus5_7Returned //тестирую метод add
  public void addPositiveIntegers(){
    // orrange упорядочить установить
    Calculator calc = new Calculator();

    //act- выполнить действие
    int result = calc.add(2,5);
    // assert- сравнить результат с правильным
    assertEquals(7,result);


      }
    };


