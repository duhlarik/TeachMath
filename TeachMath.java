import java.util.Scanner;
import java.util.Stack;

public class TeachMath {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		Stack<Integer> s = new Stack<Integer>();

		int number;
		int answer = 0;
		int x;
		int y;

		System.out.println("Enter a calculation in Postfix.");

		String input = scan1.nextLine();

		for (int i = 0; i < input.length(); i++) {

			switch (input.charAt(i)) {
			case '*':
			case '/':
			case '+':
			case '-':
				x = s.pop();
				y = s.pop();
				char operator = input.charAt(i);
				if (operator == ('*')) {
					answer = x * y;
				} else if (operator == ('/')) {
					answer = y / x;
				} else if (operator == ('+')) {
					answer = x + y;
				} else {
					answer = y - x;
				}
				s.push(answer);
				break;
			default:
				number = Character.getNumericValue(input.charAt(i));
				s.push(number);
				break;
			}
		}
		System.out.println(answer);

		scan1.close();
	}

}
