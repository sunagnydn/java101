import java.util.Scanner;

class UcakBiletiFiyati {

	public static void main(String[] args) {

		// Girilen bilgilere göre uçak bileti fiyatı hesaplayan program

		Scanner scanner = new Scanner(System.in);

		System.out.print("Mesafeyi giriniz: ");
		double mesafe = scanner.nextDouble();
		System.out.print("Yolcunun yaşı: ");
		int yas = scanner.nextInt();
		System.out.println("Yolculuk tipini giriniz: \nSeçenekler: \n1-Tek yön\n 2-Gidiş-Dönüş): ");
		int yolculukTipi = scanner.nextInt();

		double normalFiyat = mesafe * 0.1;
		double indirimliFiyat=normalFiyat;
		if (mesafe > 0 && yas > 0) {
			if (yas < 12) {
				indirimliFiyat = normalFiyat * 0.5;
			} else if (yas >= 12 && yas < 24) {
				indirimliFiyat = normalFiyat * 0.9;
			} else if (yas > 65) {
				indirimliFiyat = normalFiyat * 0.7;
			}
			switch (yolculukTipi) {
			case 1:
				System.out.println("Tek yön. Ödenecek miktar: "+ indirimliFiyat);
				break;
			case 2:
				System.out.println("Gidiş-Dönüş. Ödenecek miktar: "+(indirimliFiyat*0.8*2));
				break;
			default:
				System.out.println("Hatalı seçim yaptınız.");
			}
		} else {
			System.out.println("Yaş ve mesafe pozitif girilmelidir.");
		}
		scanner.close();
	}

}
