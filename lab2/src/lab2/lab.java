package lab2;

public class lab<T> {

	
	public static void main(String args[])
	{
		Integer[] arr = new Integer[3];
		Alarm alaarm = new Alarm(4, 2.2, 1, "urzadzenie", "opis", 3242342);
		System.out.println(alaarm.toString());
	int a = 2;
	System.out.println("\n");
		Spectrum<Integer> spektrum = new Spectrum<Integer>(true, 5, "km", 3.0,  arr, "device", "Opis", 435345);
		System.out.println(spektrum.toString());
		TimeHistory tajm = new TimeHistory(5.5, 2, "km", 3.3,  arr, "Mikrofalówka", "TimeHistory", 2143254);
		System.out.println("\n");
		System.out.println(tajm.toString());
	}
}
