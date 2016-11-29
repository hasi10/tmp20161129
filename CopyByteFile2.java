import java.io.*;

public class CopyByteFile {
	public static void main(String[] args) {
		// 1. 変数・データを準備する
		FileInputStream in = null;
		FileOutputStream out = null;

		// 2. ストリーム処理
		//   1byteずつ、読んで、書く
		try {
			// ストリームをつくる
			for(int i = 0; i < 20; i++){
			in = new FileInputStream("abc.jpg");
				if(i%2==0){
			out = new FileOutputStream("xya.jpg");
		}
	}

			// データを読み書きする
			int d;
			while((d = in.read()) != -1){
				out.write(d);
			}

			System.out.println("コピー終わり");

		} catch(IOException e) {
			System.out.println("IOエラーです。");

		} finally {
			// ストリームを閉じる
			try {
				in.close();
				out.close();

			} catch (IOException e) {
				System.out.println("IOエラーです。");
			}
		}
	}
}	

