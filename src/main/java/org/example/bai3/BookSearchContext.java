package org.example.bai3;

import java.util.List;

public class BookSearchContext {
    private SearchStrategy strategy;
    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }
    public List<Book> executeSearch(String query, List<Book> books) {
        if (strategy == null) {
            throw new IllegalStateException("Search strategy not set");
        }
        return strategy.search(query, books);
    }
}
