package Calculator;

public class Output {

	public static void main(String[] args) {

		Double a;
		Double b;

		Calculator add = new Calculator();
		String add_new = add.Add(76.0, 65.0);
		System.out.println(add_new);

		Calculator sub = new Calculator();
		Double sub_new = sub.Sub(89.0, 81.5);
		System.out.println("Subtraction of two numbers is " + sub_new);

		Calculator mult = new Calculator();
		mult.Mult(10.0, 20.0);

		Calculator div = new Calculator();
		Double div_new = div.Div(14.0, 5.0);
		System.out.println("Division of two numbers is " + div_new);

	}

}
