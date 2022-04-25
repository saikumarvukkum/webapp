package com.nt.test;

import java.util.List;

import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		List<Integer> list=List.of(10,15,18,20,25,30);
		System.out.println(list);
	    List<Integer> list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println(list2);
	    System.out.println(list2.containsAll(list));
	    list.stream().filter(i->i%2==0).forEach(h->System.out.println(h));
	}

}
