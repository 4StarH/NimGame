import java.util.Scanner;
import java.util.Random;

public class Nim {

	private Pile pileA;
	private Pile pileB;
	private Pile pileC;
	private Random rnd;
	private Scanner input = new Scanner(System.in);
	
	public Nim() { //default constructor that constructs the three piles
		rnd = new Random();
		pileA = new Pile(10);
		pileB = new Pile(10);
		pileC = new Pile(10);
		
		
	}//end of default constructor
	
	public boolean PlayerMove() {
		
		System.out.println("Please select a pile. You can choose 'A', 'B', or 'C'.");
		String PileChoice = input.next();
		
		while (!PileChoice.equalsIgnoreCase("a") && !PileChoice.equalsIgnoreCase("b")  && !PileChoice.equalsIgnoreCase("c") ) { // if the player enters a character that isnt A, B, or C it requests another character.
			
			System.out.println("Please choose Pile 'A', 'B', or 'C'.");
			PileChoice = input.next();
			
		}
		
		if (PileChoice == "a" || PileChoice == "A") {
			
			int sizeA = pileA.getSize();
			
			if (sizeA == 0) {
				
				System.out.println("Pile A is empty, please choose Pile 'B' or 'C'.");
				PileChoice = input.next();
								
			} else {
				
				System.out.println("How many would you like to remove?");
				int amount = input.nextInt();
				
				if (amount >sizeA) {
					
					System.out.println("Error: You can't take out more objects than are in the pile.");
					System.out.println("How many would you like to remove from " + sizeA + "objects?");
					amount = input.nextInt();
										
				} else {
					
					pileA.remove(amount);
					
				}
			}
			
		} //end of if choice is a
		
		if (PileChoice == "b" || PileChoice == "B") {
			
			int sizeB = pileB.getSize();
			
			if (sizeB == 0) {
				
				System.out.println("Pile B is empty, please choose Pile 'A' or 'C'.");
				PileChoice = input.next();
								
			} else {
				
				System.out.println("How many would you like to remove?");
				int amount = input.nextInt();
				
				if (amount >sizeB) {
					
					System.out.println("Error: You can't take out more objects than are in the pile.");
					System.out.println("How many would you like to remove from " + sizeB + "objects?");
					amount = input.nextInt();
										
				} else {
					
					pileB.remove(amount);
					
				}
			}
			
		} //end of if choice is b
	
		if (PileChoice == "c" || PileChoice == "C") {
			
			int sizeC = pileC.getSize();
			
			if (sizeC == 0) {
				
				System.out.println("Pile C is empty, please choose Pile 'A' or 'B'.");
				PileChoice = input.next();
								
			} else {
				
				System.out.println("How many would you like to remove?");
				int amount = input.nextInt();
				
				if (amount >sizeC) {
					
					System.out.println("Error: You can't take out more objects than are in the pile.");
					System.out.println("How many would you like to remove from " + sizeC + "objects?");
					amount = input.nextInt();
										
				} else {
					
					pileC.remove(amount);
					
				}
			}
			
		} //end of if choice is c
	
return true;
		
	}//end of player move
		
	public void computerRandomMove() {
				
		int cTake = rnd.nextInt(9) +1;
		int cMove = rnd.nextInt(2);
		int size;
	do {	
		
		if (cMove == 0) {
			
			int sizeA = pileA.getSize();
			size = sizeA;
			
			if (size > 0) {
				
				if (size >= cTake) {
					
					pileA.remove(cTake);
					
				}	else {
				
					sizeA = 0;
										
				}	
			}
		} else if (cMove == 1) {
		
			int sizeB = pileB.getSize();
			size = sizeB;
			
			if (size > 0) {
				
				if (size >= cTake) {
					
					pileB.remove(cTake);
					
				}	else {
				
					sizeB = 0;
										
				}	
			}
		
		}	else  {
			
			int sizeC = pileC.getSize();
			size = sizeC;
			
			if (size > 0) {
				
				if (size >= cTake) {
					
					pileC.remove(cTake);
					
				}	else {
				
					sizeC = 0;
										
				}	
			}
		}	
		
	} while (size == 0); {
		
		cMove = rnd.nextInt(2);
		
	}
	}
	
	public boolean done() {

		
		if (pileA.getSize() == 0 && pileB.getSize() == 0 && pileC.getSize() ==0) {
		
			return true; //check if game is finished
			
		}
			
			return false;
			
			
	}//end of done
	
	public void printPiles() {
		
		System.out.println("A    B    C");
		System.out.println(pileA.getSize() + "   " + pileB.getSize() + "   " + pileC.getSize());
		
	}	
//end of Computer move method

	} //end of Nim method
	//end of NIm
