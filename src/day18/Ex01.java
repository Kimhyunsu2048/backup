package day18;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<Book> books = new HashSet<Book>();
		books.add(new Book("책1", "저자1", "출판사1", 5000));
		books.add(new Book("책2", "저자2", "출판사2", 8000));
		books.add(new Book("책3", "저자3", "출판사3", 11000));
		books.add(new Book("책3", "저자3", "출판사3", 12000));
		books.add(new Book("책4", "저자4", "출판사4", 9000));
		
		for(Book book : books) {
			System.out.println(book);
		}

	}
}
