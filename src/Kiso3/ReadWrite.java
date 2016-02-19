package Kiso3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
     void read(){
    	System.out.println("どのファイルを読みますか？");
    	String namefile =new Scanner(System.in).nextLine();
    	String plase = "C:\\users\\internous\\";
    		    try{
    		    	File file = new File(plase + namefile );
    		      if (checkBeforeReadfile(file)){
    		        BufferedReader br = new BufferedReader(new FileReader(file));

    		        String str;
    		        while((str = br.readLine()) != null){
    		          System.out.println(str);
    		        }

    		        br.close();
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

     void write(){
    	 System.out.println("ファイルに書き込みをします");
    	 System.out.println("書き込みたいファイル名をどうぞ！");
    	 String namefile =new Scanner(System.in).nextLine();
    	 String plase = "C:\\users\\internous\\";
    	 try{
    	      File file = new File(plase + namefile);

    	      if (checkBeforeWritefile(file)){
    	        FileWriter filewriter = new FileWriter(file, true);
                System.out.println("内容");
                String bun =new Scanner(System.in).nextLine();
    	        filewriter.write(bun + "¥r¥n");
    	        String bun2  =new Scanner(System.in).nextLine();
    	        filewriter.write(bun2 + "¥r¥n");

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
     }

