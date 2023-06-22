package Problema4;

public class AvionLuptaTomCat extends AvionLupta {

	public AvionLuptaTomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
		// TODO Auto-generated constructor stub
	}
public void refuell() {
	System.out.println(getPlaneID()+" - Initiating refueling procedure");
	System.out.println("- Locating refueller");
	System.out.println("- Catching up");
	System.out.println("- Refueling");
	System.out.println("- Refueling complete");
	
}
}
