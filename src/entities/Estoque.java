package entities;

public class Estoque {
	public String name;
	public double price;
	public int quantity;
	
	public Estoque(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double TotalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void AddProducts(int quan) {
		this.quantity += quan;
	}
	
	public void RemoveProducts(int quan) {
		this.quantity -= quan;
	}
	
	public String toString() {
		return name
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock());
	}
}
