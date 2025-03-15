package org.example.bai3;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy"),
                new Book("1984", "George Orwell", "Dystopia"),
                new Book("Animal Farm", "George Orwell", "Political Satire")
        );

        BookSearchContext context = new BookSearchContext();

        context.setStrategy(new TitleSearchStrategy());
        System.out.println("Search by title: " + context.executeSearch("1984", books));

        context.setStrategy(new AuthorSearchStrategy());
        System.out.println("Search by author: " + context.executeSearch("Orwell", books));

        context.setStrategy(new CategorySearchStrategy());
        System.out.println("Search by category: " + context.executeSearch("Fantasy", books));
    }
}
