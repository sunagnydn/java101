import java.util.Scanner;

public class KDVTutariHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
		double fiyat = scanner.nextDouble();

		if (fiyat >= 0 && fiyat <= 1000) {
			double kdvliFiyat = ((fiyat * 18 / 100) + fiyat);
			System.out.println("KDV'li fiyatı:" + kdvliFiyat);
			double kdvFiyat = (fiyat * 18 / 100);
			System.out.println("KDV fiyatı:" + kdvFiyat);
		} else {
			double kdvliFiyat = ((fiyat * 8 / 100) + fiyat);
			System.out.println("KDV'li fiyatı:" + kdvliFiyat);
			double kdvFiyat = (fiyat * 8 / 100);
			System.out.println("KDV fiyatı:" + kdvFiyat);
		}
		scanner.close();

	}

}
