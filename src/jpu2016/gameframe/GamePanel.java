package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer
{
	public GamePanel(IGraphicsBuilder graphicBuilder)
	{
		JLabel lab = new JLabel(new ImageIcon("C:/Users/asus/Pictures/120929052345100645.jpg"));

	}
	
	public void update(Observable observable)
	{
		
	}
	
	public void paintComponent(Graphics graphic)
	{
		
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
