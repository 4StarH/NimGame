public class NimGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nim game = new Nim();

		
		System.out.println("Welcome to the game of NIM!\nWe play by the misère rules.");
		System.out.println("Good Luck!");
		
do{
game.printPiles();
if (game.PlayerMove() == true) {
	if(game.done() == true) {
		
		System.out.println("You lose.");
		break;
	} else {
		game.computerRandomMove();
		if (game.done() == true) {
			
			System.out.println("You Win!");
			break;
		}
	} 
}
	

} while (game.done()==false);
}
}
