
public class KisoKadai1 {

	public static void main(String[] args) {
		System.out.println("九九表");
		System.out.println("Ｘの値は");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println("Ｙの値は");
		int y = new java.util.Scanner(System.in).nextInt();
       	for(int i = 1; i<=x; i++){
    		for(int j = 1 ; j<=y; j++){
    			int ans = i * j ;
    			if(ans<=9) System.out.print(" ");
    			System.out.print( i + "×" + j + "=" +ans + " ");
    		}
    	  System.out.println("\n");
    	}

	}

}
