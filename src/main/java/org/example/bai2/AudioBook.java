package org.example.bai2;

public class AudioBook extends Book {
    public AudioBook(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book: " + title + " by " + author);
    }
}