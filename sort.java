package Arraylist;
import java.util.*;
//. Write a Java program to sort a given array list

     class Sort_ArrayList{

         public static void main(String[] args)
         {
             List<String> ArrayList_Book = new ArrayList<>();
             ArrayList_Book.add("Python");
             ArrayList_Book.add("C");
             ArrayList_Book.add("Php");
             ArrayList_Book.add("Css");
             ArrayList_Book.add("MySQL");
             ArrayList_Book.add("C++");
             ArrayList_Book.add("Java");
             ArrayList_Book.add("HTML");
             ArrayList_Book.add("Bootstrap");

             System.out.println("Before Sort : "+ArrayList_Book);
             Collections.sort(ArrayList_Book);
             System.out.println("After Sort : "+ArrayList_Book);
         }
     }
