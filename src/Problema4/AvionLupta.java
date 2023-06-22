package Problema4;

public abstract class AvionLupta extends Avion {

	public AvionLupta(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
		
	}
	public void launchMissile() {
		System.out.println(getPlaneID()+"- Initiating missile launch procedure");
		System.out.println("- Acquiring target");
		System.out.println("- Launching missile");
		System.out.println("- Breaking away");
		System.out.println("- Missile launch complete");
		
	}

}
