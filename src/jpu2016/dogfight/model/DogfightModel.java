package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

// NOTE(doc): big sky wawa luw fluffy

public class DogfightModel extends Observable implements IDogfightModel{
	private Sky sky;
	private ArrayList<IMobile> mobiles;
	public DogfightModel(){
		//sky= new Sky();
	}
	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		sky = new Sky(dimension);
	}

	@Override
	public void addMobile(IMobile Mobile) {
		mobiles.add(Mobile);
	}

	@Override
	public void removeMobile(IMobile Mobile) {
		mobiles.remove(Mobile);
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobileHavesMoved() {
		// TODO Auto-generated method stub
		
	}

}
