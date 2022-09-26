
public class Main {

	public static void main(String[] args) {
		String student1 = "Anıl";
		String student2 = "Arda";
		String student3 = "Atlas";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		System.out.println("___________________");

		String[] students = new String[4];
		students[0] = "anıl";
		students[1] = "arda";
		students[2] = "atlas";
		students[3] = "berkcan";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("___________________");
		
		for (String student : students) {
			System.out.println(student);
		}

	}

}
