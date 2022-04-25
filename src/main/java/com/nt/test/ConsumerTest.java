package com.nt.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		  Book b =new Book("core java",250,30, 2);
		  Book b1=new Book("core java",350, 40, 10);
		  Book b2=new Book("core java",450, 50, 20);
		  Book b3=new Book("core java",550, 60, 30);
		  Book b4=new Book("core java",650, 70, 40);
		  Book b5=new Book("core java",750, 80, 50);
		  
		 List<Book> lst=List.of(b1,b2,b3,b4,b5);
		 Integer a=40;
		Consumer<Book> c=i->System.out.println(i);
		IntConsumer c1=i->System.out.println(i);
		ObjIntConsumer<List> obj=(ob,i)->System.out.println(ob+""+i);
		obj.accept(lst, 20);
		c1.accept(a);
		c.accept(b5);
	}//main(-)

}//class
