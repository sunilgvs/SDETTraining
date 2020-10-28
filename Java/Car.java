
public class Car {

	String color;
	String transmision;
	int make;
	int tyres;
	int doors;
	
	Car(){
		
		this.tyres =4;
		this.doors =4;
		}
	
	public void displayCharacterstics() {
		
		System.out.println("Color of my Car is " + color);
		System.out.println("I have Doors " + doors);
		System.out.println("I have Tyres aswell " + tyres);
			
	}
	public void accelarate() {
		
		System.out.println("car is moving forward");
			}
	public void brake() {
		System.out.println("Car has stopped");
	}
}

