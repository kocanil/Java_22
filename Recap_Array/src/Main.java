
public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double sum = 0;
		double max = myList[1];

		for (double number : myList) {
			sum = sum + number;
			if (max < number) {
				max = number;
			}
			
		}
		System.out.println("Sum of this numbers are: " + sum);
		System.out.println("Biggest number is: " + max);
	}

}
