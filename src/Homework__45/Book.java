package Homework__45;
//Задача 1
  //  Используйте класс Book (книга) из предыдущего домашнего задания.
//
  //  Создайте компаратор, который позволит сортировать книги по названию,
    //  при одинаковых названиях - по автору (и там, и там - по алфавиту)

    //Задача 2* (не обязательно)
    //Создайте компаратор, который позволит сортировать книги по убыванию количества страниц,
      //  а при совпадающем объёме - по названиям ("по возрастанию", по алфавиту).
public class Book {
  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages){

    this.author = author;
    this.title = title;
    this.pages = pages;

  }

}
