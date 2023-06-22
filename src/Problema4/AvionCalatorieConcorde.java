package Problema4;

public class AvionCalatorieConcorde extends AvioaneCalatorie {
	public boolean supersonicmode = false;
	public AvionCalatorieConcorde(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower, maxPassengers);
		// TODO Auto-generated constructor stub
	}
	
	public void goSuperSonic() {
		if(supersonicmode==false) {
		System.out.println(getPlaneID() + " -Supersoic mode activated ");	
		supersonicmode=true;
		}
		else {
			System.out.println(getPlaneID() + " -Supersoic mode Deactivated ");
			supersonicmode=false;
		}
		
	}

}
