package org.example.bai2;

public abstract class Book {
    protected String id;
    protected String title;
    protected String author;

    public Book() {
    }

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public abstract void displayInfo();
}
