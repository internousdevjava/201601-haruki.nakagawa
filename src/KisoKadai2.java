
public class KisoKadai2 {
	public static void main(String[] args) {
		  int r =new java.util.Random().nextInt(100);
		  for (int i = 0; i < 5; i++) {
		  System.out.println("１～100の数を入力してください");
		  int kazu = new java.util.Scanner(System.in).nextInt();
	      if(r==kazu){
	    	  System.out.println("当たり！");
	    	  break;
	           }else  {
			System.out.println("ハズレ\n");
			if (i==4) {
				System.out.println("答えは" + r +  "です");
				break;
			}
			System.out.println("ヒント");
	      if (r<kazu) {
			System.out.println("答えより大きいです");
		   }else if (r>kazu) {
			System.out.println("答えより小さいです");
		    }
	      }
	    }
		  System.out.println("ゲームを終わりにします");
	 }
}
