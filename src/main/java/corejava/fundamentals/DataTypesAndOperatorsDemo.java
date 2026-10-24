package corejava.fundamentals;

public class DataTypesAndOperatorsDemo {

	public static void main(String[] args) {
		int quantity = 4;
		double unitPrice = 2.5;
		boolean inStock = true;
		char currencySymbol = '$';
		String item = "notebook";

		double total = quantity * unitPrice;
		boolean eligibleForPurchase = inStock && total > 0;

		System.out.println("Item: " + item);
		System.out.println("Total: " + currencySymbol + total);
		System.out.println("Eligible for purchase: " + eligibleForPurchase);
	}
}
