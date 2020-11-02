import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passenger;
	private int maxPassenger;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
		
	
	public Plane(int maxPassenger) {
		this.maxPassenger = maxPassenger;
		this.passenger = new ArrayList<>();
		
	}
	
	public void onboard(String passenger) {
		this.passenger.add(passenger);
		
	}
	
	public Date takeoff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
		
	}
	
	public Date getlastTimeLand() {
		
		return lastTimeLanded;
	}

	public void land() {
		this.lastTimeLanded = new Date();
		this.passenger.clear();
		
		
	}
	
	
	public List<String> getPassengerList(){
		
		return passenger;
	}
}
