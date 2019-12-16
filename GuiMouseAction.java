package pocetak;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuiMouseAction extends JFrame{
	private JPanel mousePanel;
	private JLabel statusbar;
	
	public GuiMouseAction() {
		super("Title");
		
		mousePanel=new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
		
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener {
		public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));
		}
		public void mousePressed(MouseEvent event) {
			statusbar.setText("You pressed down th mouse");
			mousePanel.setBackground(Color.GRAY);
		}
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("You released the mouse");
			mousePanel.setBackground(Color.ORANGE);
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("You enter the area");
			mousePanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusbar.setText("The mouse has left the window");
			mousePanel.setBackground(Color.CYAN);
		}
		//these are mouse motion events
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("You are dragging the mouse");
			mousePanel.setBackground(Color.PINK);
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("you moved the mouse");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
