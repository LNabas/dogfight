package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer
{
	private int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private UserOrder UserOrder;
	
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
		this.gameLoop();
	}
	
	public void setViewSystem(IViewSystem viewSystem)
	{
		
	}
	
	private void gameLoop()
	{
	}
	
	
	
	
}
