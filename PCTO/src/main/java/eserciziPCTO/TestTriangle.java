package eserciziPCTO;

public class TestTriangle {

	public static void main(String[] args) {

		Triangle myTriangle = new Triangle(10, 5);

		float area = myTriangle.getArea();

		System.out.println("L'area del triangolo è: " + area);
	}
}