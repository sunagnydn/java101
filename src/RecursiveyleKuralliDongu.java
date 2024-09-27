import java.util.Scanner;

public class RecursiveyleKuralliDongu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Sayı giriniz:");
		int n= scanner.nextInt();
		
		artir(azalt(n),n);

		scanner.close();
	}

	public static int azalt(int n) {
		if (n <= 0) {
			return n;
		} else {
			System.out.print(n + " ");
			return azalt(n - 5);
		}
	}

	public static int artir(int n, int max) {
		if (n == max) {
			System.out.print(n + " ");
			return n;
		} else {
			System.out.print(n + " ");
			return artir(n + 5,max);
		}
	}
}
