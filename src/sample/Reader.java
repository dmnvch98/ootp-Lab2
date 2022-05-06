package sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Reader
{
   private int id;
   private String name;
   private ArrayList books;
   private Integer balance;
   private static final AtomicInteger count = new AtomicInteger(0);

   public Reader(String name, Integer balance) {
      this.id = count.incrementAndGet();
      this.name = name;
      this.balance = balance;
   }

   private Void fillBalance(Long amount) 
   {
    return null;
   }

   @Override
   public String toString() {
      return name + " : " + balance;
   }
}