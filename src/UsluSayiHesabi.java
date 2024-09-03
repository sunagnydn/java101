import java.util.Scanner;

public class UsluSayiHesabi {

	public static void main(String[] args) {

		// Girilen değerler ile üslü sayı hesaplayan program.

		Scanner scanner = new Scanner(System.in);

		System.out.print("x= ");
		int x = scanner.nextInt();
		System.out.print("y= ");
		int y = scanner.nextInt();

		int us=1;
		System.out.print(x + "^" + y + ": ");
		for (int i = 1; i <= y; i++) {
			us *= x;
		}
		System.out.print(us);
		
		scanner.close();
	}

}
