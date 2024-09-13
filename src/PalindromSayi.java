
public class PalindromSayi {

	public static void main(String[] args) {

		// Bir sayının "Palindrom Sayı" olup olmadığını bulan bir program

		System.out.println(isPalindrom(2));

	}

	public static boolean isPalindrom(int n) {
		int temp = n, sonBasamak, sayininTersi = 0;

		while (temp > 0) {
			sonBasamak = temp % 10;
			sayininTersi = (sayininTersi * 10) + sonBasamak;
			temp /= 10;
		}

		System.out.println(n + " sayısı palindrom sayı mıdır?:");
		if (sayininTersi == n)
			return true;
		else
			return false;

	}

}
