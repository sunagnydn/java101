import java.util.Scanner;

public class DortVeBesinKuvvetleri {

	public static void main(String[] args) {

		//Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		System.out.println("4'ün kuvvetleri: ");
		for(int i=1; i<=sayi; i*=4) {   // i ilk başta 1 4'le çarpınca 4 16 64.. diye devam eder
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("5'in kuvvetleri: ");
		for(int i=1; i<=sayi; i*=5) {
			System.out.print(i+" ");
		}
		
		
		
	}

}
