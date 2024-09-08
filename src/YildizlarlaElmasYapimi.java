
import java.util.Scanner;

public class YildizlarlaElmasYapimi {

	public static void main(String[] args) {

		// Yıldız kullanarak üçgen yapımı

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz: ");
		int n = scanner.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
