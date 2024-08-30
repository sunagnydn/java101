import java.util.Scanner;

public class Burclar {

	public static void main(String[] args) {

		// switch case kullanmadan burçları bulduran program

		Scanner scanner = new Scanner(System.in);

		System.out.print("Doğduğunuz ayı giriniz: ");
		String ay = scanner.nextLine();
		System.out.print("Doğduğunuz günü giriniz: ");
		int gun = scanner.nextInt();

		if (ay.equals("Ocak")) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Oğlak burcu");
			} else if (gun >= 22 && gun <= 31) {
				System.out.println("Kova burcu");
			}
		} else if (ay.equals("Şubat")) {
			if (gun >= 1 && gun <= 19) {
				System.out.println("Kova burcu");
			}else if (gun >= 20 && gun <= 29) {
				System.out.println("Balık burcu");
			}
		}else if (ay.equals("Mart")) {
			if (gun >= 1 && gun <= 20) {
				System.out.println("Balık burcu");
			}else if (gun >= 21 && gun <= 31) {
				System.out.println("Koç burcu");
			}
		}else if (ay.equals("Nisan")) {
			if (gun >= 1 && gun <= 20) {
				System.out.println("Koç burcu");
			}else if (gun >= 21 && gun <= 30) {
				System.out.println("Boğa burcu");
			}
		}else if (ay.equals("Mayıs")) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Boğa burcu");
			}else if (gun >= 22 && gun <= 31) {
				System.out.println("İkizler burcu");
			}
		}else if (ay.equals("Haziran")) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("İkizler burcu");
			}else if (gun >= 23 && gun <= 30) {
				System.out.println("Yengeç burcu");
			}
		}else if (ay.equals("Temmuz")) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Yengeç burcu");
			}else if (gun >= 23 && gun <= 31) {
				System.out.println("Aslan burcu");
			}
		}else if (ay.equals("Ağustos")) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Aslan burcu");
			}else if (gun >= 23 && gun <= 31) {
				System.out.println("Başak burcu");
			}
		}else if (ay.equals("Eylül")) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Başak burcu");
			}else if (gun >= 23 && gun <= 30) {
				System.out.println("Terazi burcu");
			}
		}else if (ay.equals("Ekim")) {
			if (gun >= 1 && gun <= 22) {
				System.out.println("Terazi burcu");
			}else if (gun >= 23 && gun <= 31) {
				System.out.println("Akrep burcu");
			}
		}else if (ay.equals("Kasım")) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Akrep burcu");
			}else if (gun >= 22 && gun <= 30) {
				System.out.println("Yay burcu");
			}
		}else if (ay.equals("Aralık")) {
			if (gun >= 1 && gun <= 21) {
				System.out.println("Yay burcu");
			}else if (gun >= 22 && gun <= 31) {
				System.out.println("Oğlak burcu");
			}
		}else {
			System.out.println("Yanlış girdiniz. Yeniden deneyiniz.");
		}
		scanner.close();
	}

}
