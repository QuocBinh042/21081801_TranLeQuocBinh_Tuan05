package org.example.bai2;

public class EBook extends Book{
    public EBook(String id, String title, String author){
        super(id,title,author);
    }
    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + title + " by " + author);
    }
}
