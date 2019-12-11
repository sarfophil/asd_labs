package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class dynProxy implements InvocationHandler {

	private Object obj;

	public dynProxy(Object obj) {
		this.obj = obj;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T newInstance(T obj) {
		 return (T) Proxy.newProxyInstance(
		 obj.getClass().getClassLoader(),
		 obj.getClass().getInterfaces(),
		 new dynProxy(obj));
		 } 

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;

		try {
			System.out.println("before method " + method.getName());
			result = method.invoke(obj, args);
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
		} finally {
			System.out.println("after method " + method.getName()); 
		}

		return result;
	}

	

}
