package tictactoe.pkg;

import jsound.audio.SimpleAudio;
interface Sound extends Runnable{
	void run();
}

interface PlaySound extends Runnable{
	void run();
	void stop();
}

class Game extends Thread{
	
	public void run() {
		Welcome.launch();
	}
}
public class Controller {

	public static Thread game , sound;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game = new Game();
		
		sound = new Thread(new PlaySound() {
			SimpleAudio player;
			public void run() {
				try {
					player = new SimpleAudio("FirstvisittoKA.wav");
					player.play();
				}catch(Exception e) {
					System.err.println(e);
				}
			}
			@Override
			public void stop() {
				player.stop();
				player.close();
			}
		});
		sound.start();
		game.start();
		try {
			game.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sound.stop();
		
	}

}
