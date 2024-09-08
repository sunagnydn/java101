import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// Döngü kullanılarak atm yapımı

		Scanner scanner = new Scanner(System.in);

		String kullaniciAdi, sifre;
		double bakiye = 1782.28;
		int hak = 3;

		while (hak > 0) {
			System.out.println("Kullanıcı adı:");
			kullaniciAdi = scanner.nextLine();
			System.out.println("Şifre:");
			sifre = scanner.nextLine();

			if ((kullaniciAdi.equals("patica")) && (sifre.equals("dev123"))) {
				System.out.println("Kodluyoruz Bankasına hoş geldiniz!");
				
				while (true) { // işlem döngüsü
					System.out.println("İşlem secenekleri:\n 1-Para yatırma\n 2-Para çekme\n 3-Bakiye sorgulama\n 4-Çıkış");
					int secenekler = scanner.nextInt();
					
					switch (secenekler) {
					case 1:
						System.out.println("Yatırılacak para miktarını giriniz:");
						double yatirilacak = scanner.nextDouble();
						bakiye += yatirilacak;
						break;
					case 2:
						System.out.println("Çekmek istediğiniz miktarı giriniz:");
						double cekilecek = scanner.nextDouble();
						if (cekilecek > bakiye) {
							System.out.println("Yetersiz bakiye.");
						} else {
							System.out.println(cekilecek + " lira çekilmiştir");
							bakiye -= cekilecek;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz: " + bakiye);
						break;
					case 4:
						System.out.println("Çıkış yapılıyor.");
						hak = 0; // döngüden çıkmak için hakları sıfırla.
						break;
					default:
						System.out.println("Yanlış seçim. Yeniden deneyiniz.");
					}
					if (secenekler == 4) {
						break;
					}
				}
			} else {
				hak--;
				if (hak > 0) {
					System.out.println("Kullanıcı adı veya şifre yanlış. Yeniden deneyiniz.");
					System.out.println(hak + " hakkınız kaldı.");
				} else {
					System.out.println("Giriş hakkınız kalmadı. Hesabınız bloke edilmiştir.");
				}
			}

		}

		scanner.close();

	}

}