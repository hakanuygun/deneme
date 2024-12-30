package com.sirketadi.yazaradi2;

public interface IDeneme {
	
	void denemeMethod();
    default void method() {
    	System.out.println("Deneme");
    	
    }

}
