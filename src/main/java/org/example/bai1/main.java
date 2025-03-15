package org.example.bai1;

public class main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        library.addBook(new Book("1","The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("2","1984", "George Orwell"));

        System.out.println("Danh sách sách trong Library:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
