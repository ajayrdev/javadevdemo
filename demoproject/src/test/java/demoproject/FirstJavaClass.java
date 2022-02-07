package demoproject;


public class FirstJavaClass {

	public static void main(String[] args) {
		
		System.out.println("Welcome!");
		Subject();
		Subject("Manualtesting");
		
		FirstJavaClass myObj = new FirstJavaClass();
		myObj.DynamicMethod();
		
	}
	public static void Subject() {
		System.out.println("Automation");
	}
	
	public static void Subject(String myMessage) {
		System.out.println(myMessage);
	}
	
	public void DynamicMethod() {
		String message =  "Iam going to Write Dynamic Method";
		System.out.println(message);
	}
}
