package com.nt.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListSetTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		/*ArrayList<String> lst=(ArrayList<String>) List.of("A","B","C","D","A");
		List<Integer> lst1=List.of(1,2,3,4,5,1,3,4);
		System.out.println(lst);
		LinkedHashSet<?> set,set1=null;
		set=new LinkedHashSet(lst);
		set1=new LinkedHashSet(lst1);
		//System.out.println(set);
		//System.out.println(set1);
		List<Integer> uq=lst1.stream().distinct().collect(Collectors.toList());
		System.out.println(uq);
		//Set<Integer> st=lst1.stream().map(ob->{new LinkedHashSet<Integer>().add(ob)}).collect(Collectors.toSet());
		//System.out.println(st);
		//lst.stream().map(ob->{new HashSet<String>().add(ob)})*/
		ArrayList<Integer> ay=new ArrayList<>();
		ay.add(1);
		ay.add(2);
		ay.add(3);
		ay.add(2, 5);
		System.out.println(ay);
		HashSet<Integer> set=new HashSet();
		set.add(1);
		set.add(10);
		set.add(15);
		set.add(18);
		System.out.println(set);
	}//main(-)

}//class
