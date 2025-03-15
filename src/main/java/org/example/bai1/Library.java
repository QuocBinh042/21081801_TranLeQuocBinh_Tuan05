package org.example.bai1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;

    private Library(){
        books = new ArrayList<>();
    }

    public static Library getInstance(){
        if (instance == null){
            synchronized (Library.class){
                if (instance == null){
                    instance = new Library();
                }
            }
        }
        return instance;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void deleteBook(Book book){
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
