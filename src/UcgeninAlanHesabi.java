import java.util.Scanner;

public class UcgeninAlanHesabi {

	public static void main(String[] args) {
		
		//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Üçgenin kenar uzunlukları:");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		
		double u = (a+b+c)/2;
		double alan= u*(u-a)*(u-b)*(u-c);
		System.out.print("Üçgenin alanı: "+Math.sqrt(alan));
		
		scanner.close();
		
	}

}
