package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Map;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("sss", "ssss");
        Book book2 = bookManager.createBook("sss", "ssss");
        Book book3 = bookManager.createBook("sss", "ssss");
        System.out.println(book1.equals(book2));

        Book book4 = bookManager.createBook("sdddasdas", "sasdads");
        Book book5 = bookManager.createBook("sdddasdas", "sasdads");

    }
}
