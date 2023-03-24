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
  @Test
  public void addCommutative(){
    assertEquals(calc.add(3,57),calc.add(57,3));
  }
  @Test
  public  void addPositiveZero(){
    assertEquals(5,calc.add(5,0));
    assertEquals(5,calc.add(0,5));
  }
  @Test
  public void addZeros(){
    assertEquals(0,calc.add(0,0));
  }
  @Test
      public void addLimits(){
    assertEquals(-1,calc.add(Integer.MIN_VALUE,Integer.MAX_VALUE));
    assertEquals(-1,calc.add(Integer.MAX_VALUE,Integer.MIN_VALUE));
    assertEquals(Integer.MAX_VALUE,calc.add(Integer.MAX_VALUE,0));
    assertEquals(Integer.MIN_VALUE,calc.add(0,Integer.MIN_VALUE));


  }

}


