import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		
		//C(n,r) kombinasyon hesaplayan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n: ");
		int n=scanner.nextInt();
		System.out.print("r: ");
		int r=scanner.nextInt();
		
		int fakn=1,fakr=1,faknr=1;
		
		for (int i=1; i<=n; i++) {
			fakn*=i;
		}
		for (int i=1; i<=r; i++) {
			fakr*=i;
		}
		for (int i=1; i<=(n-r); i++) {
			faknr*=i;
		}
		int C = (fakn)/(fakr*faknr);
		System.out.println("C= n!/(r!*(n-r)!)");
		System.out.println(n+" nin "+r+" li kombinasyonu: " + C);
		
		scanner.close();
	}

}
