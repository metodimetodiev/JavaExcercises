package simpleTasks;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello";
		System.out.println(reversed(text));
	}

	public static String reversed(String text) {
		char[] txt = text.toCharArray();
		int i = 0;
		int j = txt.length - 1;
		while (i < j) {
			char temp = txt[i];
			txt[i] = txt[j];
			txt[j] = temp;
			i++;
			j--;
		}
		String reversed = new String(txt);
		return reversed;
	}

}
