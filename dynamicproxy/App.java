package dynamicproxy;

public class App {
	public static void main(String args[]) {
		// Old ...
		System.out.println("Original:: ");
		Foo foo = new FooImpl();
		foo.bar(null);

		// New ...
		System.out.println("\nProxied:: ");
		foo = dynProxy.newInstance(foo);
		foo.bar(null);
	}
}
