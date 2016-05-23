package jpu2016.dogfight.model;

public class Missile {
	private int SPEED = 4;
	private int WEIGHT = 30;
	private int HEIGHT = 10;
	private int MAX_DISTANCE_TRAVELED = 1400;
	private String IMAGE = "missile";
	public Missile(Direction direction, Dimension dimension){
		
	}
	public int getWidthWithADirection(Direction direction){
		return -1;
	}
	public int getHeightWithADirection(Direction direction){
		return -1;
	}
	public void move(){
		
	}
	public boolean isWeapon(){
		return false;
	}
}
