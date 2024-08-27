import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {

		// Yarıçapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan
		// program

		Scanner scanner = new Scanner(System.in);

		System.out.print("Dairenin yarıçapı:");
		double r = scanner.nextDouble();
		double pi = 3.14;

		double cevre = 2 * pi * r;
		double alan = pi * r * r;

		System.out.println("Dairenin alanı: " + alan + "\nDairenin çevresi: " + cevre);

		scanner.close();
	}

}
