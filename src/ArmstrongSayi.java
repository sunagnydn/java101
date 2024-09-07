import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {

		//n basamaklı bir sayının rakamlarının n. üslerinin toplamı sayının kendisine armstrong sayıdır.
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		int temp=sayi;
		int a, bas=0;
		
		while(temp>0) {
			a=temp%10;
			bas++;
			temp/=10;
		}
		temp=sayi;
		int arm=0;
		while(temp>0) {
			a=temp%10;
			arm+=Math.pow(a, bas);
			temp/=10;
		}
		if (arm==sayi) {
			System.out.println("Sayı armstrong sayıdır.");
		}else {
			System.out.println("Sayı armstrong sayı değildir.");
		}
		
		scanner.close();
	}

}
