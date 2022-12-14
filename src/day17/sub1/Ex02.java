package day17.sub1;

import java.util.*;

public class Ex02 {
	private static HashSet<Book> library = new HashSet<Book>();
	
	public static void main(String[] args) {
		
		library.add(new Book("책1","저자1","출판사1"));
		library.add(new Book("책2","저자2","출판사2"));
		library.add(new Book("책3","저자3","출판사3"));
		library.add(new Book("책3","저자3","출판사3"));
		library.add(new Book("책4","저자4","출판사4"));
		
		for(Book book : library) {
			System.out.println(book);
		}
		System.out.println("----책조회----");
		Book book3 = findBook("책3");
		System.out.println(book3);
	}

	private static Book findBook(String title) {
		
		for(Book book : library) {
			if(book.getTitle().equals(title)) {
				return book;
			}
		}	
		return null; // 제목에 해당하는 책이 없는 경우
	}
}
