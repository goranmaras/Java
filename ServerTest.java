package MessengerProgram;
import javax.swing.*;

public class ServerTest {
	public static void main(String[] args) {
		Server gogkson = new Server();
		gogkson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gogkson.startRunning();
	}
}
