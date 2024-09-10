public class AsalSayi {
	public static void main(String[] args) {

		System.out.println("1'den 100'e kadar olan asal sayılar: ");

		for (int i = 2; i <= 100; i++) {
			int c = 0;
			if (i == 2) {
				System.out.print(i+" ");
			} else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						c++;
						break;
					}
				}
				if (c == 0) {
					System.out.print(i+" ");
				}
			}
		}
	}
}