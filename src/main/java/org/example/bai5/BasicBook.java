package org.example.bai5;

public class BasicBook implements BorrowableBook{
    private String title;

    public BasicBook(String title) {
        this.title = title;
    }
    @Override
    public void borrow() {
        System.out.println("Mượn sách: " + title);
    }
}
