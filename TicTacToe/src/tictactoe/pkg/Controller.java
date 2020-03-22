package tictactoe.pkg;

class Game extends Thread{
	
	public void run() {
		Welcome.launch();
	}
}
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread game = new Game();
		game.start();
	}

}
