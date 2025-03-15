package org.example.bai5;

public class main {
    public static void main(String[] args) {
        BorrowableBook basicBook = new BasicBook("Lập trình Java");

        System.out.println("Trường hợp 1:");
        basicBook.borrow();

        System.out.println("\nTrường hợp 2:");
        BorrowableBook extendedBook = new ExtensionDecorator(basicBook);
        extendedBook.borrow();

        System.out.println("\nTrường hợp 3:");
        BorrowableBook specialBook = new SpecialEditionDecorator(basicBook);
        specialBook.borrow();

        System.out.println("\nTrường hợp 4:");
        BorrowableBook combinedBook = new ExtensionDecorator(new SpecialEditionDecorator(basicBook));
        combinedBook.borrow();
    }
}
