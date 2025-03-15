package org.example.bai5;

public class ExtensionDecorator extends BookDecorator{
    public ExtensionDecorator(BorrowableBook book) {
        super(book);
    }
    public void extendBorrowing() {
        System.out.println("Gia hạn thời gian mượn sách.");
    }

    @Override
    public void borrow() {
        super.borrow();
        extendBorrowing();
    }
}
