import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {

		// Sayı çarpımlarının -kendisi hariç- toplamına eşitse mükemmel sayıdır.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Sayı giriniz: ");
		int sayi = scanner.nextInt();

		int top=0;
		for (int i = 1; i < sayi; i++) {
			if(sayi%i==0) {
				top+=i;
			}
		}
		
		if (sayi==top) {
			System.out.println("Mükemmel sayıdır.");
		}else {
			System.out.println("Mükemmel sayı değildir.");
		}
		
		scanner.close();
	}

}
