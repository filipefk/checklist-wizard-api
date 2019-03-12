package com.filipefk.checklist.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main {
    
	public static void main( String[] args ) {
    	List<String> lista = new ArrayList<>();
    	
    	lista.add("Hello");
    	lista.add("World!");
    	
        lista.forEach(System.out::println);
    }
    
}
