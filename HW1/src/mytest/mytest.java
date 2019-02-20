package mytest;


import static org.junit.Assert.*;

import org.junit.Test;

import najwaClass.Book;

public class mytest {
    Book a=new Book();
	@Test
	public void test1() {
		//fail("Not yet implemented");
	
		assertTrue(a.count()==0);
		
	}
	@Test
	public void test2() {
	int pric=127;
	a.price(127);
		assertSame(a.count(),1 );
		
	}
	@Test
	public void test3() {
	int pric=100;
	a.price(100);
		assertTrue(a.count()==2 && a.price==227);
		
	}
	
}
