/**
 * 
 */
package iteratorInclass.internal.functor;

/**
 * @author SARFO PHILIP
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyVectorClass vector = new MyVectorClass();
		
		for(int i = 0; i < 10; i++)
			vector.add(i*90);
		
		//Total
		System.out.println("Total: "+ vector.sum());
		
		//Average
		System.out.println("Average: "+vector.average());
		
		//Greater than 2
		System.out.println("Greater than 2: "+vector.greaterThanTwo()+"\n\n");
		
		
		int total = 0;
		int count = 0;
		//External		
		for(Integer value : vector) {
			total += value;
			count++;
		}
		
		System.out.println("External Total :"+ total);
		System.out.println("External Total :"+ total/count);
		
		
		

	}

}
