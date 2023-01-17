package ch01_familiarize_with_design_patterns.part01_iterator.dong_min;

import java.util.Iterator;

/**
 * 동작
 */
public class Main {

    // 책장의 크기
    private static final int MAX_SIZE = 4;

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(MAX_SIZE);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("하나 더 추가됐지롱"));

        // 명시적으로 Iterator를 사용하는 방법
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        /* 확장 for문을 사용하는 방법
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
        */

        System.out.println("책장의 크기 : " + MAX_SIZE);
        System.out.println("책을 추가할 수 있나? " + bookShelf.getLength());
    }
}