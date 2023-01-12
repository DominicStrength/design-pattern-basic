package IteratorPattern;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {

    private Book[] books;
    private int last = 0;

    //Book의 크기는 BookShelf가 만들어질 대 정해짐
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    //책상에 꽂혀 있는 책을 반복해서 처리
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
