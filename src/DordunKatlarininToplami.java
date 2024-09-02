import java.util.Scanner;

public class DordunKatlarininToplami {

	public static void main(String[] args) {
		
		//Tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program.
		
		Scanner scanner = new Scanner(System.in);
		
		int top=0;
		while(true) {
			System.out.println("Sayı giriniz:");
			int sayi = scanner.nextInt();
			
			if (sayi%2!=0) {
				break;
			}
			if (sayi%4==0) {
				top+=sayi;
			}
		}
		System.out.println("Girilenlerden 4'ün katı olanların toplamı: "+top);
		scanner.close();
	}

}
