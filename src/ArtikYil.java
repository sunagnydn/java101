import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {

		// Artık yılları bulan program.
		// Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Yıl:");
		int yil = scanner.nextInt();

		if (yil % 4 == 0) {
			if (yil % 100 == 0) {
				if (yil % 400 == 0) {
					System.out.println(yil + " Artık yıldır.");
				} else {
					System.out.println(yil + " Artık yıl değildir.");
				}
			} else {
				System.out.println(yil + " Artık yıldır.");
			}

		} else {
			System.out.println(yil + " Artık yıl değildir.");
		}

		scanner.close();
	}

}
