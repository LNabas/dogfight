package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{
	private int speed;
	private Direction direction;
	private Dimension dimension;
	private Position position;
	private Image image;
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		this.speed=speed;
		this.direction=direction;
		this.position=position;
		this.dimension=dimension;
		// TODO(doc): image
		//this.image = image;
	}
	@Override
	public Direction getDirection() {
		return direction;
	}
	@Override
	public void setDirection(Direction direction) {
		this.direction=direction;
	}

	@Override
	public Point getPosition() {
		return null;
	}

	@Override
	public Dimension getDimension() {
		return dimension;
	}
	
	@Override
	public int getWidth() {
		return dimension.getWidth();
	}
	@Override
	public int getHeight() {
		return dimension.getHeight();
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightmodel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void moveUp(){
		
	}
	private void moveRight(){
		
	}
	private void moveDown(){
		
	}
	private void moveLeft(){
		
	}
	
	public Color getColor(){
		return null;
	}
	
	public IDogfightModel getDogfightModel(){
		return null;
	}
	public void setDogfightModel(IDogfightModel dogfightmodel){
		
	}

}
