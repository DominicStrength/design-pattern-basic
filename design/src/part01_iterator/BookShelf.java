package part01_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 책장
 */
public class BookShelf implements Iterable<Book> {

    private ArrayList<Book> books;
    // private int last = 0;

    // 책장안에 책들의 최대 개수 정의
    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    // n번 째 책 이름
    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    // Iterable 인터페이스의 메소드 오버라이드
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
