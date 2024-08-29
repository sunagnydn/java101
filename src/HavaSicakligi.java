import java.util.Scanner;

public class HavaSicakligi {

	public static void main(String[] args) {

		// Hava sıcaklığına göre etkinlik öneren program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sıcaklığı giriniz: ");
		int sicaklik = scanner.nextInt();

		if (sicaklik < 5) {
			System.out.println("Kayak yapabilirsiniz.");
		} else if (sicaklik >= 5 || sicaklik < 15) {
			System.out.println("Tiyatroya gidebilirsiniz.");
		}else if (sicaklik>=15 || sicaklik<25) {
			System.out.println("Sahide yürüyüşe çıkabilirsiniz.");
		}else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		scanner.close();
	}

}
