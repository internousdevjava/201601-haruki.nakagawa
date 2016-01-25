
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class KIsoKadai3 {

	public static void main(String[] args) {
        int y =1;
        while (y==1) {
		System.out.println("[メニュー] １：新規作成   ２：ファイル読み込み  ３：ファイル書き込み  ４:終了  \n");
		int menu =new Scanner(System.in).nextInt();
          switch(menu){
		case 1:
			Create();
			y =1;
			break;
		case 2:
		   Read();
		   y =1;
		    break;
		case 3:
			System.out.println("[メニュー]  １：追記  ２：上書き");
			int menu2 =new java.util.Scanner(System.in).nextInt();
			if (menu2 == 1) {
				write();
			y = 1;
			}else if (menu2 == 2) {
				write2();
			}
			y = 1;
			break;
		case 4:
		   y = 0;
		   System.out.println("\n終了します\n");
		   break;

		 }
		}
	}

	public static void Create() {
		 System.out.println("ファイルを作成します");
		 System.out.println("ファイル名をどうぞ！");
		String namefile =new Scanner(System.in).nextLine();
		String fileplase ="C:\\users\\internous\\";
		    File newfile = new File( fileplase + namefile);

		    try{
		      if (newfile.createNewFile()){
		        System.out.println("ファイルの作成に成功しました");
		      }else{
		        System.out.println("ファイルの作成に失敗しました");
		      }
		    }catch(IOException e){
		      System.out.println(e);
		    }


		  }

	 public static void Read(){
		 System.out.println("どのファイルを読みますか？");
	    	String namefile =new Scanner(System.in).nextLine();
	    	String plase = "C:\\users\\internous\\";
	    		    try{
	    		    	System.out.println("ファイルを読み込みます \n");
	    		    	File file = new File(plase + namefile );
	    		      if (checkBeforeReadfile(file)){
	    		        BufferedReader br = new BufferedReader(new FileReader(file));
	    		        String str;

	    		        while((str = br.readLine()) != null){
	    		          System.out.println(str);
	    		        }
	    		        br.close();
	    		        System.out.println("\nファイルの読み込みを終了します\n");
	    		      }else{
	    		        System.out.println("ファイルが見つからないか開けません");
	    		      }
	    		    }catch(FileNotFoundException e){
	    		      System.out.println(e);
	    		    }catch(IOException e){
	    		      System.out.println(e);
	    		    }
	    		  }

	    		  private static boolean checkBeforeReadfile(File file){
	    		    if (file.exists()){
	    		      if (file.isFile() && file.canRead()){
	    		        return true;
	    		      }
	    		    }

	    		    return false;
	    		  }

	      public static void write(){
	    	  System.out.println("ファイルに書き込みをします");
	     	 System.out.println("書き込みたいファイル名をどうぞ！");
	     	 String namefile =new Scanner(System.in).nextLine();
	     	 String plase = "C:\\users\\internous\\";
	     	 try{
	     	      File file = new File(plase + namefile);
	     	      if (checkBeforeWritefile(file)){
	     	        FileWriter filewriter = new FileWriter(file, true);

	                 System.out.println("\n内容\n");
	                 String bun =new Scanner(System.in).nextLine();
	     	        filewriter.write(bun + "\n");
	     	        System.out.println("\n");
	     	        String bun2  =new Scanner(System.in).nextLine();
	     	        filewriter.write(bun2 + "\n");
                   System.out.println("\n入力を終了します\n");
	     	        filewriter.close();
	     	      }else{
	     	        System.out.println("ファイルに書き込めません");
	     	      }
	     	    }catch(IOException e){
	     	      System.out.println(e);
	     	    }
	     	  }

	     	  private static boolean checkBeforeWritefile(File file){
	     	    if (file.exists()){
	     	      if (file.isFile() && file.canWrite()){
	     	        return true;
	     	      }
	     	    }

	     	    return false;
	     	  }
	    public static void write2() {
	    	 System.out.println("ファイルに書き込みをします");
	     	 System.out.println("書き込みたいファイル名をどうぞ！");
	     	 String namefile =new Scanner(System.in).nextLine();
	     	 String plase = "C:\\users\\internous\\";

	    	try{
	    	      File file = new File(plase + namefile);

	    	      if (checkBeforeWritefile(file)){
	    	        FileWriter filewriter = new FileWriter(file);
	    	        System.out.println("\n内容\n");
	                 String bun =new Scanner(System.in).nextLine();
	    	        filewriter.write(bun + "\n");
	    	        System.out.println("\n");
	     	        String bun2  =new Scanner(System.in).nextLine();
	    	        filewriter.write(bun2 + "\n");
	    	        System.out.println("\n入力を終了します\n");
	    	        filewriter.close();
	    	      }else{
	    	        System.out.println("ファイルに書き込めません");
	    	      }
	    	    }catch(IOException e){
	    	      System.out.println(e);
	    	    }
	    	  }
	    	  private static boolean checkBeforeWritefile1(File file){
	    	    if (file.exists()){
	    	      if (file.isFile() && file.canWrite()){
	    	        return true;
	    	      }
	    	    }

	    	    return false;
		}
}







