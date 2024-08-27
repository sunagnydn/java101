import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		
		//gidilen mesafeye göre taksimetre tutarını ekrana yazdıran program
		
		Scanner scanner = new Scanner(System.in);
		
		int minTutar=20;
		int acilis=10;
		double kmBasina=2.2;
		
		System.out.println("Gidilen mesafeyi km cinsinden giriniz: ");
		double mesafe = scanner.nextDouble();
		
		double toplam=acilis+(mesafe*kmBasina);
		toplam=(toplam<20)? minTutar: toplam;
		
		System.out.println("Ödenecek tutar: " +toplam );
		
		scanner.close();
		
	}

}
