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
	public IArea getArea() {
		return sky;
	}
	public void buildArea(Dimension dimension) {
		sky = new Sky(dimension);
	}
	public void addMobile(IMobile Mobile) {
		mobiles.add(Mobile);
	}
	public void removeMobile(IMobile Mobile) {
		mobiles.remove(Mobile);
	}
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		for(IMobile v : mobiles){
			if(v.isPlayer(player)){
				return v;
			}
		}
		return null;
	}
	public void setMobileHasMoved() {
		// TODO Auto-generated method stub
		this.hasChanged();
		this.notifyObservers();
	}

}
