import java.util.Scanner;

public class NotOrtalamasiHesaplama {

	public static void main(String[] args) {
		
		//Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastıran program.

		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Matematik notu: ");
		double matematik = scanner.nextDouble();
		
		System.out.print("Fizik notu: ");
		double fizik = scanner.nextDouble();
		
		System.out.print("Kimya notu: ");
		double kimya = scanner.nextDouble();
		
		System.out.print("Türkçe notu: ");
		double turkce = scanner.nextDouble();
		
		System.out.print("Tarih notu: ");
		double tarih = scanner.nextDouble();
		
		System.out.print("Müzik notu: ");
		double muzik = scanner.nextDouble();
		
		System.out.print("Tüm derslerin ortalaması: ");
		double ort = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println(ort);
		
		String sonuc = (ort>=60)? "Öğrenci Geçmiştir." : "Öğrenci kalmıştır.";
		System.out.println(sonuc);
		
		scanner.close();
	}

}
