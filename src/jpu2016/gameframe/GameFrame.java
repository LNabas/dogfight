package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{
	public GameFrame (String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable)
	{
	 this.setTitle(title);
	 this.addKeyListener(this);
	 this.setVisible(true);
	}
	 public void keyPressed(KeyEvent keyEvent)
	 {
		 
	 }
	 
	 public void keyReleased(KeyEvent keyEvent)
	 {
		 
	 }
	 public void Typed(KeyEvent keyEvent)
	 {
		 
	 }
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
