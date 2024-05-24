package Chap08_re;

public class CalculateSquare {
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	
	public int square(int width, int height) {
		int area=width*height;
		return area;
	}
	
	public double square(double width, double height) {
		double area=width*height;
		return area;
	}
	
	public double square(int width, double height) {
		double area=width*height;
		return area;
	}

}
