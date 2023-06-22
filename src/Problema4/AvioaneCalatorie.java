package Problema4;

public abstract class AvioaneCalatorie extends Avion {
	public int maxPassengers;
	public AvioaneCalatorie(String planeID, int totalEnginePower,int maxPassengers) {
		super(planeID, totalEnginePower);
		this.maxPassengers=maxPassengers;
		
	}
	public int getMaxPassengers() {
		return maxPassengers;
	}

}
