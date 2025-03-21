package org.example.bai3;

public class Book {
    private String title;
    private String author;
    private String category;

    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', category='" + category + "'}";
    }
}
