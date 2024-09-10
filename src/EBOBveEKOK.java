import java.util.Scanner;

public class EBOBveEKOK {
	public static void main(String[] args) {
		
		//while döngüsü kullanarak girilen sayıların EBOB ve EKOK'unu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci sayı: ");
		int a = scanner.nextInt();
		System.out.print("İkinci sayı: ");
		int b = scanner.nextInt();
		
		int ebob=1;
		int ekok=0;
		
		int sayi1=(a*b);
		while(sayi1>=a) {
			if (sayi1%a==0 && sayi1%b==0) {
				ekok=sayi1;
			}
			sayi1--;
		}
		
		int sayi2=a;
		while(sayi2>=1) {
			if (a%sayi2==0 && b%sayi2==0) {
				ebob=sayi2;
				break;
			}
			sayi2--;
		}
		
		System.out.println("EKOK(" + a + "," + b + ")=" + ekok);
		System.out.println("EBOB(" + a + "," + b + ")=" + ebob);
		
		scanner.close();
	}
}
