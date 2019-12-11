package memoization;

import memoization.demo.AdditionImpl;
import memoization.demo.Foo;
import memoization.demo.GenMemoProxy;
import memoization.demo.MultiImpl;

public class App {
	public static void main(String[] args) {
		// First; direct usage...
		 Foo<Integer,Integer> ap = new MultiImpl();
		 System.out.println(ap.compute(2));

		 // now memoized...
		 ap = new GenMemoProxy< >(ap);
		 System.out.println("Now Optimized...");
		 System.out.println(ap.compute(2));
		 System.out.println(ap.compute(3));
		 System.out.println(ap.compute(3));

		 // Another function...
		 // now memoized...
		 Foo<String,String> sap = new AdditionImpl();
		 sap = new GenMemoProxy< >(sap);
		 System.out.println("Now Optimized...");
		 System.out.println(sap.compute("Hello"));
		 System.out.println(sap.compute("World"));
		 System.out.println(sap.compute("World")); 
	}
}
