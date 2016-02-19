package Kiso3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
/**
 * ファイルの書き込みサンプル
 *　テキストファイルへの書き込み
 */
public class FileWrite {
  public static void main(String[] args) {

    // 書き込むファイルの名前
    String outputFileName = "C:\\users\\internous\\test2.txt";

    // ファイルオブジェクトの生成
    File outputFile = new File(outputFileName);

    try {
      // 出力ストリームの生成（文字コード指定）
      FileOutputStream fos = new FileOutputStream(outputFile);
      OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
      PrintWriter pw = new PrintWriter(osw);
      // ファイルへの書き込み
      pw.println("テストテストなーにがてすと？");
      pw.println("メモ使うのーーー難しいいいいいいい");
      System.out.println("ファイルに書き込みました");
      // 後始末
      pw.close();
    // エラーがあった場合は、スタックトレースを出力
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}