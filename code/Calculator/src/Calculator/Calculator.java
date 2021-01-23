package Calculator;

public class Calculator {

	public Double Add(Double add_a, Double add_b) {
		Double sum;
		sum = add_a + add_b;

		return sum;
	}

	public void printSum(Double add_a, Double add_b) {
		System.out.println("Sum = " + Add(add_a, add_b));

	}

	public Double Sub(Double sub_a, Double sub_b) {
		Double result = sub_a - sub_b;
		return result;

	}

	public void Mult(Double mult_a, Double mult_b) {
		Double mult = mult_a * mult_b;
		System.out.println("Multiplcation of 2 numbers " + mult_a + " and " + mult_b + " is " + mult);
		System.out.println("Multiplcation of 2 numbers " + mult_a + " and " + mult_b + " is " + mult_a * mult_b);
	}

	public Double Div(Double div_a, Double div_b) {
		Double div = div_a / div_b;
		return div;

	}

}
