package com.nt.inter;

public interface DefaultInterf {
     void m1();
    default void res() {
    	System.out.println("Default block");
    }
}
