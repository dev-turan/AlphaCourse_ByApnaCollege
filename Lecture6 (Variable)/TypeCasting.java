
public class TypeCasting {

	public static void main(String[] args) {
		// narrowing conversion
		float a = 25.12f;
		int b = (int) a;
		
		char ch = 'a';
		int number = ch;
		
		System.out.println(b);
		System.out.print(number);  // givers ASCI value of char 'a'

	}

}
