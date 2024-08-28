import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		// switch-case kullanarak hesap makinesi yapımı

		Scanner scanner = new Scanner(System.in);
		
		double n1,n2;
		System.out.print("İlk sayıyı giriniz: ");
		n1 = scanner.nextDouble();
		System.out.print("İkinci sayıyı giriniz: ");
		n2 = scanner.nextDouble();

		String secenekler = "Topla-->1 " + "Çıkar-->2 " + "Çarp-->3 " + "Böl-->4";
		System.out.println("Seçenekler: "+secenekler+"\nSeçim yapınız: ");
		int secim = scanner.nextInt();
		
		switch(secim){
		case 1:
			System.out.print("Sayıların toplamı: "+(n1+n2));
			break;
		case 2:
			System.out.println("Sayıların farkı: "+(n1-n2));
			break;
		case 3:
			System.out.println("Sayıların çarpımı: "+(n1*n2));
			break;
		case 4:
			if (n2==0) {
				System.out.println("Sayı 0'a bölünemez.");
			}else {
				System.out.println("Sayıların bölümü: "+(n1/n2));
			}
			break;
			
			default:
				System.out.println("Yanlış seçim.");
			
		}
				
		scanner.close();
	}

}
