import java.util.Scanner;

public class BasamakToplami {

	public static void main(String[] args) {

		// Girilen sayının basamaklarının toplamını bulan program.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Sayı giriniz: ");
		int sayi = scanner.nextInt();

		int a, bas = 0;
		int temp = sayi;
		
		while (temp > 0) {
			a = temp % 10;
			bas += a;
			temp /= 10;
		}
		
		System.out.println(sayi + " sayısının basamakları toplamı: " + bas);

		scanner.close();
	}

}
