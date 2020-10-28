
public class Activity_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Seconds = 1000000000;
		
		double Earth = 31557600;
		double Mercury = 0.2408467;
		double Venus = 0.61519726;
		double Mars = 1.8808158;
		double Jupiter = 11.862615;
		double Saturn = 29.447498;
		double Uranus = 84.016846;
		double Neptune = 164.79132;
		
		System.out.println("Age of Earth  " + Seconds / Earth );
		System.out.println("Age of Mercury  " + Seconds / Earth / Mercury );
		System.out.println("Age of Venus  " + Seconds / Earth / Venus );
		System.out.println("Age of Mars  " + Seconds / Earth / Mars );

		System.out.println("Age of Jupiter  " + Seconds / Earth / Jupiter );
		System.out.println("Age of Saturn  " + Seconds / Earth / Saturn );
		System.out.println("Age of Uranus  " + Seconds / Earth / Uranus );
		
		System.out.println("Age of Neptune  " + Seconds / Earth / Neptune );
	}

}
