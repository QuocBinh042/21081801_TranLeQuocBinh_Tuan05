package org.example.bai5;

public class SpecialEditionDecorator extends BookDecorator{
    public SpecialEditionDecorator(BorrowableBook book) {
        super(book);
    }

    public void requestSpecialEdition() {
        System.out.println("Yêu cầu sách phiên bản đặc biệt.");
    }

    @Override
    public void borrow() {
        super.borrow();
        requestSpecialEdition();
    }
}
