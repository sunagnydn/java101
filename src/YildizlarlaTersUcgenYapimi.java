import java.util.Scanner;

public class YildizlarlaTersUcgenYapimi {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		int n = scanner.nextInt();
		
		for(int i=n; i>=0; i--) {
			for(int j=(2*i+1); j>=1; j--) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}

 	


     