package dynamicproxy;

public class FooImpl implements Foo{

	@Override
	public void bar(Object obj) {
		System.out.println(" - Inside method "); 
		
	}

}
