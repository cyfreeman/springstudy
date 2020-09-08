package project002.cystudy.spring5.collection;

import java.util.List;

public class Book {

    private List<String> bookList;

    public void setList(List<String> list) {
        this.bookList = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookList=" + bookList +
                '}';
    }
}
