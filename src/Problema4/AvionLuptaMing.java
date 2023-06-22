package Problema4;

public class AvionLuptaMing extends AvionLupta {

	public AvionLuptaMing(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
		// TODO Auto-generated constructor stub
	}
	 public void highSpeedGeometry() {
		 System.out.println(getPlaneID() +"- High speed geometry selected");
	 }
	 public void normalGeometry() {
		 System.out.println(getPlaneID()+ "- Normal geometry selected");
	 }
}
