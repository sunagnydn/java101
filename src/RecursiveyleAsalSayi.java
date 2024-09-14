import java.util.Scanner;

public class RecursiveyleAsalSayi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz: ");
		int a = scanner.nextInt();

		if (asalMi(a, a - 1)) {
			System.out.println(a + " sayısı asal sayıdır.");
		} else {
			System.out.println(a + " sayısı asal sayı değildir.");
		}

		scanner.close();

	}

	public static boolean asalMi(int a, int b) {
		if (a == 1 || a == 0) {
			return false;
		} else if (a == 2) {
			return true;
		} else if (b == 1) { //b bire ulaşabildiyse sayı asaldır.
			return true;
		} else {
			return asalMi(a, b - 1);
		}
	}

}
