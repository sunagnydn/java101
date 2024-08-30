import java.util.Scanner;

public class SayilariSiralama {
	
	public static void main(String[] args) {
		
		//Girilen 3 sayıyı büyükten küçüğe sıralama
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a: ");
		double a= scanner.nextDouble();
		System.out.print("b: ");
		double b= scanner.nextDouble();
		System.out.print("c: ");
		double c= scanner.nextDouble();
		
		if (a>b) {
			if (a>c) {
				if (b>c) {
					System.out.println("a>b>c");
				}else {
					System.out.println("a>c>b");
				}
			}else {
				System.out.println("c>a>b");
			}
		}else if (b>a) {
			if (b>c) {
				if (a>c) {
					System.out.println("b>a>c");
				}else {
					System.out.println("b>c>a");
				}
			}else {
				System.out.println("c>b>a");
			}
		}
	
		scanner.close();
	}
}
