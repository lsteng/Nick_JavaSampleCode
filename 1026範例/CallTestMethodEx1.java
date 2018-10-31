package tw.leonchen.javaproject.oop.method;

class Person {
	
   public void sayHello() {
	   System.out.println("hola");
	   sayGoodBye();
   }
   
   public void sayGoodBye() {
	   System.out.println("Adios");
	   //sayHello();
   }
}


public class CallTestMethodEx1 {

	public static void main(String[] args) {
		Person mike = new Person();
		mike.sayHello();
		//mike.sayGoodBye();
		System.out.println("finished");
	}

}
