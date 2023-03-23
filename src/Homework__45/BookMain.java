package Homework__45;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
  public static void main(String[] args) {
    List<Book>books = new ArrayList<>();
    books.add(new Book("Достоевский", "Идиот",250));
    books.add(new Book("Достоевский", "Дуралей", 100));
    books.add(new Book("Толстой", "Война и мир", 500));


  }
}