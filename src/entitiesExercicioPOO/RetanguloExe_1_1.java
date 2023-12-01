package entitiesExercicioPOO;

public class RetanguloExe_1_1 {
	public double width;
	public double heigth;
	
	public double Area() {
		double area = this.width * this.heigth; 
		return area;
	}
	
	public double Perimeter() {
		double perimeter = 2 * (this.width + this.heigth);
		return perimeter;
	}
	
	public double Diagonal() {
		double diagonal = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.heigth, 2));
		return diagonal;
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f", this.Area())
				+ "\nPERIMETER = "
				+ String.format("%.2f", this.Perimeter())
				+ "\nDIAGONAL = "
				+ String.format("%.2f", this.Diagonal());
	}
}
