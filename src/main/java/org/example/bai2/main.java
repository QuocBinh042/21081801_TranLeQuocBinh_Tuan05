package org.example.bai2;

public class main {
    public static void main(String[] args) {
        Book book1 = BookFactory.createBook("paper", "1","The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = BookFactory.createBook("ebook", "2","1984", "George Orwell");
        Book book3 = BookFactory.createBook("audio","3", "To Kill a Mockingbird", "Harper Lee");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
