package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {

    private Book[] books;
    private int last = 0;
    private ArrayList<Book> list = new ArrayList<>();

    //Book의 크기는 BookShelf가 만들어질 대 정해짐
    public BookShelf() {}
    /*
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    */
    public Book getBookAt(int index) {
        // return books[index];
        return list.get(index);
    }

    public void appendBook(Book book) {
        // this.books[last] = book;
        // last++;
        list.add(book);
    }

    public int getLength() {
        // return last;
        return list.size();
    }

    //책상에 꽂혀 있는 책을 반복해서 처리
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
