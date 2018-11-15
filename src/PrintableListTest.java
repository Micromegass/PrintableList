
public class PrintableListTest {

	
	public static void main(String[] args) {
		
		
		PrintableList newList = new PrintableList(); 
		
		Person p1 = new Person("Axel");
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		Book b1 = new Book("Hitchhikers Guide");
		Person p2 = new Person("Maisoun");



		newList.addLast(p1);
		newList.addLast(cat1);
		newList.addLast(cat2);
		newList.addLast(cat3);
		newList.addLast(b1);
		newList.addLast(p2);
		
		

		PrintableList.ListIterator it = newList.listIterator();
		while (it.hasNext()) {
		    Printable elem = (Printable) it.next();
		    elem.print();
		
		}
	
	}
	
}
