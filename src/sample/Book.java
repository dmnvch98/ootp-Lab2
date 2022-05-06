package sample;

import java.util.concurrent.atomic.AtomicInteger;

public class Book
{
   private int id;
   private final String name;
   private final int year;
   private final String author;
   private Integer price;
   private Boolean isAvailable;
   private static final AtomicInteger count = new AtomicInteger(0);

   public Book(String name, int year, String author, Integer price) {
      this.id = count.incrementAndGet();
      this.name = name;
      this.year = year;
      this.author = author;
      this.price = price;
      this.isAvailable = true;
   }

   public Boolean getAvailable() {
      return isAvailable;
   }

   public void setAvailable(Boolean available) {
      isAvailable = available;
   }

   @Override
   public String toString() {
      return "Название: " + name + " Автор: " + author + " Год: " + year + " Цена: " + price + " Доступность" + isAvailable;
   }

   public int getId() {
      return id;
   }

   public Integer getPrice() {
      return price;
   }


}