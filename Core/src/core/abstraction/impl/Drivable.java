package core.abstraction.impl;

public interface Drivable {

	String SERVICE ="wam";
	
	static void display() {
		System.out.println("static method inside interface");
	}
	/* instance method is not supported
	 * void instanceMethod() {
	 * 
	 * }
	 */
	
	default void test() {
		System.out.println("default method");
	}
	
	void add();		
	
	/* initializers are not allowed
	 * static {
	 * 
	 * } 
	 * {
	 *  System.out.println("static block"); 
	 *  }
	 */
	
	/*Interface cannot have constructor 
	 * Drivable(){
	 * 
	 * }
	 */
	
}
