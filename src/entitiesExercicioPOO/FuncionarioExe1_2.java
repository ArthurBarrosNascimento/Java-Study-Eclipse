package entitiesExercicioPOO;

public class FuncionarioExe1_2 {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		this.grossSalary = this.grossSalary - this.tax;
		return this.grossSalary;
	}
	
	public void IncreaseSalary(double percentage) {
		double p = (this.grossSalary * percentage) / 100;
		this.grossSalary += p;
	}
	
	public String toString() {
		return "Updated data: "
				+ this.name
				+ ", "
				+ String.format("%.2f", this.grossSalary);
	}
}
