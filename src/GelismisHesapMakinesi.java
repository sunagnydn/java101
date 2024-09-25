import java.util.Scanner;

public class GelismisHesapMakinesi {

	static int topla(int a, int b) {
		int sonuc = a + b;
		System.out.println("Toplam: " + sonuc);
		return sonuc;
	}

	static int cikar(int a, int b) {
		int sonuc = a - b;
		System.out.println("Çıkarma: " + sonuc);
		return sonuc;
	}

	static int carp(int a, int b) {
		int sonuc = a * b;
		System.out.println("Çarpım: " + sonuc);
		return sonuc;
	}

	static int bolum(int a, int b) {
		int sonuc = 0;
		if (b != 0) {
			sonuc = a / b;
			System.out.println("Bölüm: " + sonuc);
		} else {
			System.out.println("Sıfıra bölünme işlemi yapılamaz.");
		}
		return sonuc;
	}

	static int us(int a, int b) {
		int sonuc = 1;
		for (int i = 1; i <= b; i++) {
			sonuc *= a;
		}
		System.out.println(a + "^" + b + " : " + sonuc);
		return sonuc;
	}

	static int factoriyel(int a) {
		int sonuc = 1;
		for (int i = 1; i <= a; i++) {
			sonuc *= i;
		}
		System.out.println(a + "! : " + sonuc);
		return sonuc;
	}

	static int mod(int a, int b) {
		int sonuc = a % b;
		System.out.println("Mod işlemi: " + sonuc);
		return sonuc;
	}

	static int alan(int a, int b) {
		int alan = a * b;
		System.out.println("Dikdörtgenin alanı: " + alan);
		return alan;
	}

	static int cevre(int a, int b) {
		int cevre = 2 * (a + b);
		System.out.println("Dikdörtgenin çevresi: " + cevre);
		return cevre;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String secenekler = "Seçenekler: \n1-Toplama İşlemi \n2-Çıkarma İşlemi "
				+ "\n3-Çarpma İşlemi \n4-Bölme İşlemi \n5-Üslü Sayı Hesaplama "
				+ "\n6-Faktöriyel Hesaplama \n7-Mod Alma " + "\n8-Dikdörtgen Alan Hesabı \n9-Dikdörtgen Çevre Hesabı";
		System.out.println(secenekler);
		System.out.println();

		while (true) {
			System.out.print("Bir işlem seçiniz: ");
			int secim = scanner.nextInt();

			if (secim == 0) {
				System.out.println("Çıkış yapılıyor.");
				break;
			}
			System.out.print("Birinci sayıyı giriniz: ");
			int a = scanner.nextInt();
			System.out.print("İkinci sayıyı giriniz: ");
			int b = scanner.nextInt();

			switch (secim) {
			case 1:
				topla(a, b);
				break;
			case 2:
				cikar(a, b);
				break;
			case 3:
				carp(a, b);
				break;
			case 4:
				bolum(a, b);
				break;
			case 5:
				us(a, b);
				break;
			case 6:
				factoriyel(a);
				break;
			case 7:
				mod(a, b);
				break;
			case 8:
				alan(a, b);
				break;
			case 9:
				cevre(a, b);
				break;
			default:
				System.out.println("Yanlış işlem seçimi.");
			}
		}

		scanner.close();
		
	}
}
