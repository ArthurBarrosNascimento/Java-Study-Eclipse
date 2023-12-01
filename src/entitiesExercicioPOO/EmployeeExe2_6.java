package entitiesExercicioPOO;

public class EmployeeExe2_6 {
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeExe2_6(Integer id, String name, Double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void IncreaseSalary(Double value) {
		this.salary += (this.salary * value) / 100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
