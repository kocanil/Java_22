
public class Main {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {

		case 'A':
			System.out.println("Perfect : You pass");
			break;

		case 'B':
			System.out.println("Well Done : You pass");
			break;

		case 'C':
			System.out.println("Good : You pass");
			break;

		case 'D':
			System.out.println("Ok : You pass");
			break;

		case 'F':
			System.out.println("You fail!!!");
			break;

		default:
			System.out.println("Invalid Grade Entry");

		}
		System.out.println("");
		
		switch (grade) {

		case 'A':
		case 'B':
		case 'C':
		case 'D':
			System.out.println("Pass");
			break;

		case 'F':
			System.out.println("Fail!!!");
			break;

		default:
			System.out.println("Invalid Grade Entry");

		}
	}

}
