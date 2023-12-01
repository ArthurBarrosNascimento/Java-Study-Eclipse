package entitiesExercicioPOO;

public class AlunoExe2_4 {
	private String name;
	private double n1;
	private double n2;
	
	public AlunoExe2_4(String name, double n1, double n2) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double getMedia() {
		double resultMedia = (this.n1 + this.n2) / 2;
		return resultMedia;
	} 
}
