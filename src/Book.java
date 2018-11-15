
public class Book implements Printable {
	
	private String title; 

	
	Book(String title) {
		this.title = title; 
	}
	
	
	@Override
	public void print() {
		
		System.out.println("The title is: " + title);
		
	}

}
