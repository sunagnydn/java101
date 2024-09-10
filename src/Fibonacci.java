import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Eleman sayısını giriniz: ");
		int n = scanner.nextInt();

		int birinci=0,ikinci=1;
		for(int i=1;i<=n;i++) {
			System.out.print(birinci+" ");
			int ucuncu=birinci+ikinci;
			birinci=ikinci;
			ikinci=ucuncu;
		}
		
		scanner.close();

	}

}
