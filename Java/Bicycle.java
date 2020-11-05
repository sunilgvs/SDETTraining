class Bicycle implements BicycleOperations, BicycleParts{
	
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears , int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
		
	}
	
	public void applyBrake(int decrement) {
		
		currentSpeed -= decrement;
		System.out.println("Current Speed  :" + currentSpeed);
	}

	public void speeedUp(int increment) {
		
		currentSpeed += increment;
		System.out.println("Current Speed is  " + currentSpeed);
				
	}
	
	public String bicycleDesc(){
		
	 System.out.println("No of gares and " + gears + "currentspeed " + currentSpeed);
		
	}
	
}
	
	class MountainBike extends Bicycle{
		
		public int seatHeight;
	
		public MountainBike(int gears, int currentSpeed , int starHeight) {
			
			super(gears, currentSpeed);
			seatHeight = starHeight;
		}
		
		public void setHeight(int newvalue) {
			seatHeight = newvalue;
			
		}
		
		public String bicycleDesc() {
	        return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
	    }  
	
		
	}
	


