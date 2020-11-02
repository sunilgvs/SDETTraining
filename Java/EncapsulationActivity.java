
public class EncapsulationActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plane plane = new Plane(10);
		
		plane.onboard("Sunil");
		plane.onboard("Ramya");
		plane.onboard("Kaushal");
		
		System.out.println("Take of Time  is  : " + plane.takeoff());
		System.out.println("List of Passengers : " + plane.getPassengerList());
		
		//Thread.sleep(5000);
		
		plane.land();
		
		System.out.println("Landing Time is : " + plane.getlastTimeLand());
		
		plane.getPassengerList();
	}

}
