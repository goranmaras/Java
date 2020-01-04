package MessengerProgram;

import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client Gogy; 
		Gogy = new Client("127.0.0.1");
		Gogy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gogy.startRunning();
	}
}
