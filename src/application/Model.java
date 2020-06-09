package application;

public class Model {
	public int calculate(String operator, int x, int y) {
		if (operator.contentEquals("+")) {
			return x + y;
		}
		else if (operator.contentEquals("-")) {
			return x - y;
		}
		else if (operator.contentEquals("*")) {
			return x * y;
		}
		else {
			return x / y;
		}
	}
}
