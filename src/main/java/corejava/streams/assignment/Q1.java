package corejava.streams.assignment;

import java.util.ArrayList;
import java.util.List;

import corejava.streams.assignment.Order.Type;

/*
 * Question:
	define a class "Order" with:
	enum Type
	{
		BUY,SELL;
	}
	private int quantity;
	private double price;
	private Type type;

	define setter and getter methods for all the fields.

	create 5 objects of this class and stored them inside list.
 */
class Order {
	enum Type {
		BUY, SELL;
	}

	private int quantity;
	private double price;
	private Type type;

	public Order(int quantity, double price, Type type) {
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", price=" + price + ", type=" + type + "]";
	}

}

public class Q1 {

	public static void main(String[] args) {
		Order o1 = new Order(200, 459, Order.Type.SELL);
		Order o2 = new Order(111, 465, Order.Type.SELL);
		Order o3 = new Order(908, 434, Order.Type.BUY);
		Order o4 = new Order(424, 324, Order.Type.SELL);
		Order o5 = new Order(290, 132, Order.Type.BUY);

		List<Order> list = new ArrayList<Order>();

		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		list.add(o5);
		// System.out.println(list);
		/*
		 * 1) count how many orders are for "SELL" hint:- use "filter" method of stream
		 * to check whether type is SELL and "count" method to count.
		 */
		// Long count=list.stream().filter((Order)->{return
		// Order.getType()==Type.SELL;}).count();
		System.out.print("Count of the Sell orders: ");
		System.out.println(list.stream().filter((Order) -> {
			return Order.getType() == Type.SELL;
		}).count());
		/*
		 * 2) calculate sum of all the prices hint:- use "mapToDouble" method of stream
		 * to convert price of each and every object and "sum" method to calculate total
		 * of all the prices.
		 */
		// return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		System.out.print("Sum of all price from all orders: ");
		System.out.println(
				list.stream().filter((Order) -> Order.getPrice() != 0).mapToDouble(Order -> Order.getPrice()).sum());

		/*
		 * using stream api: 3) calculate sum of all the quantities. hint:- use
		 * "mapToInt" method of stream to convert qty of each and every object and "sum"
		 * method to calculate total of all the quantities.
		 */
		System.out.print("Sum of all quantites from all orders: ");
		System.out.println(
				list.stream().filter((Order) -> Order.getQuantity() != 0).mapToInt(Order -> Order.getQuantity()).sum());

	}

}
