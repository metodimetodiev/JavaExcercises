package simpleTasks;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println(oddNumber(n));
	}
public static void primitiveTypes(){
	byte a = -128;
	short b =  (short) 500000;
	int c = 55000;
	long d = 50000000000000000l;
	float e = 50000000000000000000000.00000000000000f;
	double f = 50000000000000000000000000000000000.10000000000000000000000000000000000000000000;
	char qw = 'a';
	System.out.println(a-1);
	
}
public static boolean oddNumber(int n){
     
     
 
	 if(n%2 != 0){
		 return true;
	 }
	 else return false;
 
 
}
}
