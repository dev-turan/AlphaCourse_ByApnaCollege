
public class MaxOfThree {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 2;
		
		if(a>b && b>c) {
			System.out.print(a);
		}else if(b>a && b>c) {
			System.out.print(b);
		}else {
			System.out.print(c);
		}

	}

}
