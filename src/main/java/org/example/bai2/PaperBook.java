package org.example.bai2;

public class PaperBook extends Book{
    public PaperBook(String id, String title, String author) {
        super(id, title, author);
    }
    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + title + " by " + author);
    }
}
