package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		int sum = c.add(10, 20, 30);
		System.out.println("Sum Of the given Numbers are:- " + sum);
		int difference = c.sub(30, 20);
		System.out.println("Difference Of the given Numbers are:- " + difference);
		double product = c.mul(1.5, 1.5);
		System.out.println("Product Of the given Numbers are:- " + product);
		float quotient = c.divide(22.5f, 1.5f);
		System.out.println("Quotient Of the given Numbers are:- " + quotient);

	}

}
