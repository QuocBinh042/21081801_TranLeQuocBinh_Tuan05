package org.example.bai5;

public class BookDecorator implements BorrowableBook{
    protected BorrowableBook book;

    public BookDecorator(BorrowableBook book) {
        this.book = book;
    }
    @Override
    public void borrow() {
        book.borrow();
    }
}
