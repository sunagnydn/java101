import java.util.Scanner;

public class HarmonikSayi {

	public static void main(String[] args) {

		// 1+ (1/2)+(1/3)+...+(1/n)
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("n:");
		int n = scanner.nextInt();
		
		double har=0;
		for(int i=1; i<=n; i++) {
			har+=(1.0/i);
		}
		System.out.println(n+" sayısının harmonik sayı hesabı: "+har);
		
		scanner.close();
	}

}
