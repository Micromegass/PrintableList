
public class PrintableList {
	private Entry header = new Entry(null, null, null);
	private int size = 0;
	
 
    /* Constructs an empty Printable List. */
	PrintableList() {
        header.next = header;
        header.previous = header;
    }
	
	void addLast(Printable obj) {
        Entry newEntry = new Entry(obj,header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
}
	
		private static class Entry {
			private Printable element;
		    private Entry next;
		    private Entry previous;
			
		    Entry(Printable element, Entry next, Entry previous) {
		        this.element = element;
		        this.next = next;
		        this.previous = previous;
		    } 
		}
		
		
		
		class ListIterator {
	        private int nextIndex = 0;
	        private Entry next = header.next;
	        boolean hasNext() {
	            return nextIndex != size;
	}
	        
	        Printable next() {
	            if (nextIndex == size)
	                throw new java.util.NoSuchElementException();
	            Printable elem = next.element;
	            next = next.next;
	            nextIndex++;
	            return elem;
	        }
	        
	        
		}
		
		
	      ListIterator listIterator() {
	        return new ListIterator();
	}
	    
	    
	    
	    

	  
		
	
	

}
