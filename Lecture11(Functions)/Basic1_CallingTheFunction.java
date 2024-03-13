
public class Basic1_CallingTheFunction {
	
//	A method is like a function :It is a set of codes that perform a particular task.
//	Java Methods allow us to reuse the code without retyping the code. 
		
//	  Advantage of Method :
//		Code Reusability
//	    Code Optimization 
		
//	 Modifier: It defines the access type of the method i.e.from where it can be accessed in your application.
//	 In Java, there 4 types of access specifiers. 
//	 1.public: It is accessible in all classes in your application.
//	 2.protected: It is accessible within the class in which it is defined and in its subclasses.
//	 3.private: It is accessible only within the class in which it is defined.
//	 4.default: It is declared/defined without using any modifier. It is accessible within the same class and package within which its class is defined.

//	Code 1 :
	
	public static void printhelloworld() {
		System.out.print("hello world");
		return;
	}

	public static void main(String[] args) {
		printhelloworld();

	}

}
