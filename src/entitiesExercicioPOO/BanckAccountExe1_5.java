package entitiesExercicioPOO;

public class BanckAccountExe1_5 {
	private int countNumber;
	public String nameOwnerAccount;
	protected double deposit = 0.00;
	
	public BanckAccountExe1_5(int countNumber, String name) {
		this.countNumber = countNumber;
		this.nameOwnerAccount = name;
	}
	
	public void setName(String name) {
		this.nameOwnerAccount = name;
	}
	
	public int getCountNumber() {
		return this.countNumber;		
	}

	public String getNameOwner() {
		return this.nameOwnerAccount;
	}
	
	public double getDeposit() {
		return this.deposit;
	}
	
	public void Deposit(double value) {
		this.deposit += value;
	}
	
	public void Saque(double value) {
		this.deposit -= value + 5.00;
	}
	
	public String toString() {
		return "Account: " + this.getCountNumber()
				+ ", Holder: " + this.getNameOwner()
				+ ", Balance: " + String.format("%.2f", this.getDeposit());
	}
}
