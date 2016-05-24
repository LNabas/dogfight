package jpu2016.dogfight.controller;

import java.awt.Point;
import java.util.ArrayList;

import jpu2016.dogfight.model.Cloud;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.model.Position;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer
{
	private int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private UserOrder UserOrder;
	private IViewSystem viewSystem;
	
	public DogfightController (IDogfightModel dogfightModel)
	{
		this.dogfightModel = dogfightModel; 
		
	}
	public void orderPerform (UserOrder userOrder)
	{
		this.UserOrder =userOrder;
	}
	private void launchMissile(int player)
	{
		
		this.dogfightModel.addMobile(new Missile(
				this.dogfightModel.getMobileByPlayer(player).getDirection(),
				null
				));
	}
	
	public void play()
	{	
		this.dogfightModel.buildArea(null);
		this.gameLoop();
		this.viewSystem.displayMessage("You lose");
	}
	
	public void setViewSystem(IViewSystem viewSystem)
	{
		this.viewSystem= viewSystem;
	}
	
	private void gameLoop()
	{
		this.dogfightModel.addMobile(new Cloud(
				Direction.LEFT,
				null));
		
		while(true)
		{
		
			for(IMobile v:this.dogfightModel.getMobiles())
			{
				if(v.isWeapon())
				{
					
				}
				else
				{
				
				}
				
				v.move();
			}
		}
	}
	
	
	
	
}
