import java.io.*;

public class arrRead {
	
	public static void main(String[] args) {
		FileReader fR = new FileReader("read.txt");
		BufferedReader bR = new BUfferedReader(fR);
	
		String zeile1 = bR.readLine();
		System.out.printIn(zeile1);
		String zeile2 = bR.readLine();
		System.out.printIn(zeile2);
		String zeile3 = bR.readLine();
		System.out.printIn(zeile3);
		
		bR.close();
		}
	
}
