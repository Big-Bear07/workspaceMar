//Tripp 3/6 - Midterm Coding Exercise
public class Automobile {
	private int idNum;
	private String make;
	private String model;
	private String color;
	private int year;
	private double mpg;

//Constructor
	public Automobile(int idNum, String make, String model, String color, int year, double mpg) {
		setIdNum(idNum);
	    setMake(make);
	    setModel(model);
	    setColor(color);
	    setYear(year);
	    setMpg(mpg);
	}
	
//Setters and Getters
		public void setIdNum(int idNum) {
			if(idNum < 0 || idNum > 9999)
				idNum = 0;
			else {
				this.idNum = idNum;
			}
		}
		public int getIdNum() {
			return idNum;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getMake() {
			return make;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getModel() {
			return model;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getColor() {
			return color;
		}
		public void setYear(int year) {
			if(year < 2005 || year > 2019)
				year = 0;
			else {
				this.year = year;
			}
		}
		public int getYear() {
			return year;
		}
		public void setMpg(double mpg) {
			if(mpg < 10 || mpg > 60)
				mpg = 0;
			else {
				this.mpg = mpg;
			}
		}
		public double getMpg() {
			return mpg;
		}
}

