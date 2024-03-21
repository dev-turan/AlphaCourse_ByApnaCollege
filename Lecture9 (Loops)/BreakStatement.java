
public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			
			// skip the iteration
			if(i==2) {
				continue;
			}
			//end the loop
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		System.out.print("i am out");

	}

}
