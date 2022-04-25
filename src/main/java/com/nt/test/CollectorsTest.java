package com.nt.test;

import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

class Book{
    @Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", pages=" + pages + ", books=" + books + "]";
	}
	String name;
	double price;
    long pages;
    int books;
    public Book(String name, double price, long pages, int books) {
    	super();
    	this.name = name;
    	this.price = price;
    	this.pages = pages;
    	this.books = books;
    }
}

public class CollectorsTest {
	   public static void main(String[] args) {
		         Book b =new Book("core java",250,30, 2);
				  Book b1=new Book("core java",350, 40, 10);
				  Book b2=new Book("core java",450, 50, 20);
				  Book b3=new Book("core java",550, 60, 30);
				  Book b4=new Book("core java",650, 70, 40);
				  Book b5=new Book("core java",750, 80, 50);
				  
				 List<Book> lst=List.of(b1,b2,b3,b4,b5);
				 System.out.println(lst);
				Long l= lst.stream().collect(Collectors.counting());
				System.out.println(l);
				ToIntFunction<Book> book=p->p.books;
				System.out.println("CollectorsTest.main()"+book.applyAsInt(b5));
				Integer l1= lst.stream().collect(Collectors.summingInt(book));
				Map<Object, List<Book>> l2= lst.stream().collect(Collectors.groupingBy(p->p.name));
				System.out.println(l1);
				System.out.println(l2);
	}//main

}//class
