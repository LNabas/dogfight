package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import jpu2016.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder
{
	private int GlobalWidth;
	private int GlobalHeight;
	public GraphicsBuilder(IDogfightModel dogfightModel)
	{
		
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer)
	{
		
	}
	
	private void buildEmptySky()
	{
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer)
	{
		
	}
	
	public int getGlobalWidth()
	{
		return GlobalWidth;
		
	}
	
	public int getGlobalHeight()
	{
		return GlobalHeight;
		
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}


}
