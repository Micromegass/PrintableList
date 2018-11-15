
public class Person implements Printable {

	private String name; 
	
	Person(String name) {
		
		this.name = name;
	}
	
	
	@Override
	public void print() {
		System.out.println("My name is: " + name);
	}
	
	

}
