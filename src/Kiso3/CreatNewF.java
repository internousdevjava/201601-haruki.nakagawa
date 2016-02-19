package Kiso3;

import java.io.File;
import java.io.IOException;

public class CreatNewF {
	 void create() {
		 System.out.println("ファイルを作成します");
		 System.out.println("ファイル名をどうぞ！");
		String namefile =new java.util.Scanner(System.in).nextLine();
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
		}


