package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {


    Set<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        System.out.println(book);


        if (books.contains(book)) {
            System.out.println("juz jest ta book");
        } else {
            System.out.println("ksiazka dodana");
            books.add(book);
        }
        return book;

    }
}





