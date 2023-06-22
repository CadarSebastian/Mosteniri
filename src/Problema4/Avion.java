package Problema4;

public abstract class Avion {
 public String planeID;
 public int totalEnginePower;
public Avion(String planeID, int totalEnginePower) {
	this.planeID = planeID;
	this.totalEnginePower = totalEnginePower;
}
public String getPlaneID() {
	return planeID;
}
public int getTotalEnginePower() {
	return totalEnginePower;
}
 public void takeOff() {
	 System.out.println(getPlaneID()+"Initiating takeo↵ procedure");
	 System.out.println("- Starting engines");
	 System.out.println(" - Accelerating down the runway");
	 System.out.println("- Taking of");
	 System.out.println("- Retracting gear");
	 System.out.println("- Takeof complete");
 }
 
 public void fly() {
System.out.println(getPlaneID()+" is flying");
 }
 
 public void land() {
	 System.out.println(getPlaneID()+" - Initiating landing procedure");
	 System.out.println("- Enabling airbrakes");
	 System.out.println("- Lowering gear");
	 System.out.println("- Contacting runway");
	 System.out.println("- Decelerating");
	 System.out.println("- Stopping engines");
	 System.out.println("- Landing complete”.");
	 
 }










}
