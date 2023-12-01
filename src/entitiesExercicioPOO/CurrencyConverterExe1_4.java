package entitiesExercicioPOO;

public class CurrencyConverterExe1_4 {
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dolarPrice) {
		return amount * dolarPrice * (1.0 + IOF);
	}
}
