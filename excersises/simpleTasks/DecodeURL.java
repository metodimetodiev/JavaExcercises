package simpleTasks;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class DecodeURL {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter URL: ");
		String url = sc.nextLine();
		decodeUrl(url);

	}

	public static String decodeUrl(String url) throws UnsupportedEncodingException {
		String result = java.net.URLDecoder.decode(url, "UTF-8");
		return result;
	}
}
