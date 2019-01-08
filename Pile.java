public class Pile { //default constructor

	private int size;
	
	public Pile(int objects) { //Initial constructor
		
		size = objects;
		
	} 
	
	public int getSize() { //gets the current size of the pile and returns it.
		
		return size;
		
	}
	
	public void remove(int amount) { //removes amount from the pile and lumps it into size. Making a new pile-size

		size = size - amount;
			
	}
		
}//end of public class
