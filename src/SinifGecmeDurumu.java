import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		
		//Matematik, Fizik, Kimya, Türkçe, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastıran program.

		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Matematik notu: ");
		double matematik = scanner.nextDouble();
		
		System.out.print("Fizik notu: ");
		double fizik = scanner.nextDouble();
		
		System.out.print("Kimya notu: ");
		double kimya = scanner.nextDouble();
		
		System.out.print("Türkçe notu: ");
		double turkce = scanner.nextDouble();
		
		System.out.print("Müzik notu: ");
		double muzik = scanner.nextDouble();
		
		System.out.print("Tüm derslerin ortalaması: ");
		double ort = (matematik+fizik+kimya+turkce+muzik)/5;
		System.out.println(ort);
		
		if(ort>=55) {
			System.out.println("Öğrenci "+ ort +" ortalama ile geçmiştir.");
		}else {
			System.out.println("Öğrenci "+ ort +" ortalama ile kalmıştır.");
		}
		
		scanner.close();
	}

}
