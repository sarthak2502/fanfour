package Calculator;

public class Calculator {

	public String Add(Double add_a, Double add_b) {
		String result;
		Double sum;
		sum = add_a + add_b;
		result = "Addition of 2 number " + add_a + " and " + add_b + " is " + sum;
		System.out.println("Addition of 2 numbers " + add_a + " and " + add_b + " is " + add_a + add_b);

		return result;
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
