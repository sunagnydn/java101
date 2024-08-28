import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {

		// Kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
		// toplam tutarını ekrana yazdıran program

		Scanner scanner = new Scanner(System.in);

		double armutFiyat = 2.14;
		double elmaFiyat = 3.67;
		double domatesFiyat = 1.11;
		double muzFiyat = 0.95;
		double patlıcanFiyat = 5.00;

		System.out.print("Kaç kilo armut: ");
		double armutKilo = scanner.nextDouble();
		System.out.print("Kaç kilo elma: ");
		double elmaKilo = scanner.nextDouble();
		System.out.print("Kaç kilo domates: ");
		double domatesKilo = scanner.nextDouble();
		System.out.print("Kaç kilo muz: ");
		double muzKilo = scanner.nextDouble();
		System.out.print("Kaç kilo patlıcan: ");
		double patlıcanKilo = scanner.nextDouble();

		double toplam = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat)
				+ (muzKilo * muzFiyat) + (patlıcanKilo * patlıcanFiyat);

		System.out.println("Toplam ödenecek para:" + toplam);
		
		scanner.close();
	}

}
