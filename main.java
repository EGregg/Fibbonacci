
public class main {

	public static void main(String[] args) {
		int end = Integer.parseInt(args[0]); 
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i < end; i++) {
			System.out.println(c);
			c = a + b;
			a = b; //
			b = c;
		}
	}

}
