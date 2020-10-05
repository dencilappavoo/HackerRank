package hackerrank30days;

import java.text.MessageFormat;
import java.util.regex.Pattern;

class MyBook extends Book {
     private int price;
     MyBook(String title, String author,int price) {
         super(title, author);
         this.price = price;
     }

     @Override
     void display() {
        System.out.println(String.format("Title: %s", this.title));
        System.out.println(String.format("Author: %s",this.author));
        System.out.println(String.format("Price: %s",this.price));
     }
 }
