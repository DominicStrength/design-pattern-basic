package ch01_familiarize_with_design_patterns.part01_iterator.dong_min;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 책장 안의 책들을 순차적으로 검색
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        // 다음에 next 메소드를 호출해도 괜찮은지 알아보는 메소드
        return (index < bookShelf.getLength()) ? true : false;
    }

    @Override
    public Book next() {
        // 현재 요소를 반환하고 다음 위치로 진행
        if (!hasNext()) throw new NoSuchElementException();
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
