import java.util.Scanner;

public class VucutKitleİndeksi {

	public static void main(String[] args) {
		
		//Formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kullanıcının kilosu(kg): ");
		double kilo = scanner.nextDouble();
		System.out.print("Kullanıcının boyu(m): ");
		double boy = scanner.nextDouble();
		
		double vki = kilo/(boy*boy);
		System.out.println("Kişinin vücut kitle indeksi:" + vki);
		
		scanner.close();

	}

}
