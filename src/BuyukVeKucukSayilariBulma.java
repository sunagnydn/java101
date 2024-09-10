import java.util.Scanner;

public class BuyukVeKucukSayilariBulma {

	public static void main(String[] args) {

		// Klavyeden girilen n tane sayıdan en büyük ve en küçük olanını bulduran program

		Scanner scanner = new Scanner(System.in);

		System.out.print("Kaç sayı girilecek: ");
		int n = scanner.nextInt();

		int[] liste = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". sayıyı giriniz: ");
			liste[i] = scanner.nextInt();
		}

		int buyuk = liste[0];
		int kucuk = liste[0];

		for (int i = 0; i < liste.length; i++) {
			if (liste[i] < kucuk) {
				kucuk = liste[i];
			}
			if (liste[i] > buyuk) {
				buyuk = liste[i];
			}
		}

		System.out.println("Girilen en büyük sayı: " + buyuk + "\nGirilen en küçük sayı: " + kucuk);
		scanner.close();
	}

}