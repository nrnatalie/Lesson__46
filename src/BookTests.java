import Homework__45.Book;
import Homework__45.BookTitleAuthorComparator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BookTests {
  @Test
  public void BookWithNegativePages(){
     boolean exceptionThtown = false;
     try {
       Book b = new Book("", "", -5);

     }catch (IllegalArgumentException e){
       exceptionThtown = true;

     }
    assertTrue(exceptionThtown);

  }


  }


