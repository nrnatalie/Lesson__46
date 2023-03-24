import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;


public class CalculatorTest {
  private Calculator calc = new Calculator();

  @Test
  // public void Add_2Plus5_7Returned //тестирую метод add
  public void addPositiveIntegers() {
    // orrange упорядочить установить
    //Calculator calc = new Calculator();

    //act- выполнить действие
    int result = calc.add(2, 5);
    // assert- сравнить результат с правильным
    assertEquals(7, result);

    // или одной формулой все 3 этапа
    assertEquals(7, calc.add(2, 5));

  }

  @Test
  public void addNegativeIntegers() {
    assertEquals(-5, calc.add(-2, -3));
    assertEquals(-5, calc.add(-3,-2));
  }
  @Test
  public void addNegativZero(){
    assertEquals(-5, calc.add(-5,0));
    assertEquals(-5,calc.add(0,-5));
  }
}


