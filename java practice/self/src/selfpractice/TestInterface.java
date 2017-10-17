package selfpractice;

public interface TestInterface {

	void print();
	void exit();
	int i=5;
	 default void welcome(){
		System.out.println("Welcome Navneet");
	}
}

class Test implements TestInterface{
	
	public void print(){
		System.out.println("Hello World");
	}
	
	public void exit(){
		System.out.println("Bye");
	}
	public void welcome(){
		System.out.println("Welcome NavneetJr");
	}
}