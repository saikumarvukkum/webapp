package com.nt.test;

import java.util.List;
import java.util.function.ToIntFunction;

public class ToIntFuncTest {
       public static void main(String[] args) {
//    	List<Integer> list=List.of(10,20,30,40);
//		 ToIntFunction<Integer> lst=i->i+2;
//		 list.forEach(ob->System.out.println(lst.applyAsInt(ob)));
//		 
//    	   ToIntFunction<Integer> it=i->i+10;
//    	   Integer k=25,j=10;
//    	   for(int i=0;i<=10;i++) {
//    		   System.out.println(it.applyAsInt(i));
//    		   
    	   List<Integer> lst=List.of(10,15,20,25);
    	   ToIntFunction<List<Integer>> lt= ob->ob.size();
    	   System.out.println(lt.applyAsInt(lst));
	}//main
}//class
