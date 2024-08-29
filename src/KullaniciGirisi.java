import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		
		//Girilen şifrenin doğru olup olmadığını bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		String sifre = "123elma";
		String kullaniciAdi = "sunagnydn";
		System.out.println("Şifreyi giriniz: ");
		String sifre2 = scanner.nextLine();
		
		if (sifre2.equals(sifre)) {
			System.out.println(kullaniciAdi+ " Hesabına giriş yapıldı.");
		}else {
			System.out.println("Şifre yanlış");
			System.out.println("Şifreyi sıfırlamak ister misiniz? "+" Seçenekler: \n1-Evet \n2-Hayır");
			int sifirla = scanner.nextInt();
			scanner.nextLine(); //nextint'ten sonra nextline eklemeyince sonra gelecek olan scanner'ı atlıyor.
			switch(sifirla) {
			case 1:
				System.out.println("Yeni şifre eskisiyle aynı olamaz.\nYeni şifreyi giriniz:");
				String yeniSifre = scanner.nextLine();
				if(yeniSifre.equals(sifre)) {
					System.out.println("Yeni şifre eski şifreyle aynı olamaz. Yeniden deneyiniz.");
				}else {
					System.out.println("Şifreniz değiştirilmiştir.");
				}
				break;
			case 2:
				System.out.println("Şifre sıfırlanmıyor.");
			}
		}
		
		scanner.close();
		
	}

}
