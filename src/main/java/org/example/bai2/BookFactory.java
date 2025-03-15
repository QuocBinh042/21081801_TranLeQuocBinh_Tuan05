package org.example.bai2;

public class BookFactory {
    public static Book createBook(String type, String id, String title, String author) {
        if (type.equalsIgnoreCase("paper")) {
            return new PaperBook(id, title, author);
        } else if (type.equalsIgnoreCase("ebook")) {
            return new EBook(id, title, author);
        } else if (type.equalsIgnoreCase("audio")) {
            return new AudioBook(id, title, author);
        } else {
            throw new IllegalArgumentException("Invalid book type: " + type);
        }
    }
}
