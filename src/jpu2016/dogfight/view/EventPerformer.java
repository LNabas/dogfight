package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer extends KeyAdapter implements IEventPerformer 
{
	public EventPerformer(IOrderPerformer orderPerformer)
	{
		
	}
	public void eventPerform(KeyEvent keyCode)
	{
		

	}
	private UserOrder keyCodeToUserOrder(int keycode){
		return null;
		
	}
}
