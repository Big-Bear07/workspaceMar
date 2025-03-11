//Tripp 3/6 - Midterm Coding Exercise
public class TestAutomobile {

	public static void main(String[] args) {	
//Cars
		Automobile one = new Automobile(1, "Ford","Mustang","red", 2018, 45.5);
		Automobile two = new Automobile(-2, "Ford","Mustang","red", 2018, 45.5);		
		Automobile three = new Automobile(3, "Ford","Mustang","red", 2000, 45.5);
		Automobile four = new Automobile(5, "Ford","Mustang","red", 2018, 70);

//Print
		printOut(one);
		printOut(two);
		printOut(three);
		printOut(four);
	}
	
	private static void printOut(Automobile car) {
		System.out.println("ID Number: "+ car.getIdNum());
		System.out.println("Make: "+ car.getMake());
		System.out.println("Model: "+ car.getModel());
		System.out.println("Color: "+ car.getColor());
		System.out.println("Year: "+ car.getYear());
		System.out.println("MPG: "+ car.getMpg());
		System.out.println("*****************************");
	}
}

