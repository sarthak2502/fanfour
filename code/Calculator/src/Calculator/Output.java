package Calculator;

public class Output {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Double add_new = calc.Add(76.0, 65.0);
		System.out.println(add_new);

		calc.printSum(76.0, 67.0);

		Double sub_new = calc.Sub(89.0, 81.5);
		System.out.println("Subtraction of two numbers is " + sub_new);

		calc.Mult(10.0, 20.0);

		Double div_new = calc.Div(14.0, 5.0);
		System.out.println("Division of two numbers is " + div_new);

	}

}
