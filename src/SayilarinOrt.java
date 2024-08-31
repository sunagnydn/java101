import java.util.Scanner;

public class SayilarinOrt {

	public static void main(String[] args) {

		// 3 ve 4'e bölünen sayıların ortalamasını bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.print("Kaça kadar: ");
		int n = scanner.nextInt();

		int top = 0, c = 0;

		if (n < 12) {
			System.out.println("12'den büyük bir sayı giriniz.");
		} else {
			for (int i = 1; i <= n; i++) {
				if (i % 4 == 0 && i % 3 == 0) {
					top += i;
					c++;
				}
			}
			System.out.println(top / c);
		}
		

		scanner.close();
	}

}
