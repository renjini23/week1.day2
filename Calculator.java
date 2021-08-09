package week1.day2;

public class Calculator {
	// Assignment #1: ( Class and Methods)
	int sum;
	int difference;
	double product;
	float quotient;

	public int add(int num1, int num2, int num3) {
		sum = num1 + num2 + num3;
		return sum;

	}

	public int sub(int num1, int num2) {
		difference = num1 - num2;
		return difference;
	}

	public double mul(double num1, double num2) {
		product = num1 * num2;
		return product;
	}

	public float divide(float num1, float num2) {
		quotient = num1 / num2;
		return quotient;
	}
}
