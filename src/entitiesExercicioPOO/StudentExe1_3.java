package entitiesExercicioPOO;

public class StudentExe1_3 {
	public String name;
	public double notaTr1;
	public double notaTr2;
	public double notaTr3;
	
	public String toString() {
		double finalGrade = this.notaTr1 + this.notaTr2 + this.notaTr3;
		if (finalGrade > 60.00) {
			return "FINAL GRADE = "
					+ String.format("%.2f", finalGrade)
					+ "\nPASS";
		}
		else {
			double miss = finalGrade - 60.00;
			return "FINAL GRADE = "
					+ String.format("%.2f", finalGrade)
					+ "\nFAILED"
					+ "\nMISSING "
					+ String.format("%.2f", miss);
		}
		
	}
}
