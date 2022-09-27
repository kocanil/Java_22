
public class Main {

	public static void main(String[] args) {

		String[][] cities = new String[3][2];

		cities[0][0] = "Ankara";
		cities[0][1] = "Kayseri";
		cities[1][0] = "Sivas";
		cities[1][1] = "İstanbul";
		cities[2][0] = "Bursa";
		cities[2][1] = "Edirne";

		for (int i = 0; i <= 1; i++) {
			for (int j = 1; j >= 0 & j <= 1 ; j++) {
				System.out.println(cities[i][j]);
			}
		}
		
		System.out.println("----------------------");

		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				for (int k = 0; k <= 0; k++) {
					System.out.println(cities[i][j]);
				}

			}
		}

	}

}
