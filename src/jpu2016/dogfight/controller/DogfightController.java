package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;

public class DogfightController implements IOrderPerformer
{
	private int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private userOrder UserOrder;
	
	public DogfightController (IDogfightModel dogfightModel)
	{
		
	}
	public orderPerform (userOrder UserOrder)
	{
		
	}
	private void launchMissile(int player)
	{
		
	}
	
	public void play()
	{
		
	}
	
	public void setViewSystem(IViewSystem viewSystem)
	{
		
	}
	
	private void gameLoop()
	{
	}
	
	
	public int getTIME_SLEEP() 
	{
		return TIME_SLEEP;
	}
	public void setTIME_SLEEP(int tIME_SLEEP)
	{
		TIME_SLEEP = tIME_SLEEP;
	}
	public IDogfightModel getDogfightModel()
	{
		return dogfightModel;
	}
	public void setDogfightModel(IDogfightModel dogfightModel)
	{
		this.dogfightModel = dogfightModel;
	}
	public userOrder getUserOrder()
	{
		return UserOrder;
	}
	public void setUserOrder(userOrder userOrder)
	{
		UserOrder = userOrder;
	}
	
	
	
	
	
}
