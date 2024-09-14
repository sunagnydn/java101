
public class RecursiveyleUsluSayi {

	public static void main(String[] args) {

		System.out.println(us(5,3));
		
	}
	
	public static int us(int x,int y) {
		if (y==0) {
			return 1;
		}else if (y==1) {
			return x;
		}else {
			return x*us(x, y-1);
		}
	}
}
