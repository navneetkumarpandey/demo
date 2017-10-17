package selfpractice;

public class CheckInterface {

	public static void  main (String args[]){
		
		Test T1 = new Test();
		T1.print();
		
		TestInterface T2;
		T2 = T1;
				
		T2.print();
		T2.welcome();
	}
}
