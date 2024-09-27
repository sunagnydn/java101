public class KuralliDongu {
    public static void main(String[] args) {
        dongu(16);
    }
    
    public static int dongu(int n) {
        int temp = n;
        
        while (temp >= 0) {
            System.out.print(temp + " ");
            temp -= 5;
        }
        
        int sonDurum= temp + 5; 
        while (temp <= n) {
        	if(sonDurum!=temp) {
        		System.out.print(temp + " ");
        	}
        	temp += 5;
        }
        return temp;
    }
}
