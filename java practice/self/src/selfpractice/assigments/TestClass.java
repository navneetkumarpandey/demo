package selfpractice.assigments;

import java.util.ArrayList;
import java.util.List;

public class TestClass implements Test{

	public static void main(String[] args) {
		
		List <String> words = new ArrayList<String>();
		
		words.add("Navneet");
		String sent = "Good Morning Dear Fellow";
		String[] ss = sent.split(" ");
		for(String s:ss){
			
		words.add(s);
		
		}
		System.out.println(words);
		words.remove(3);
		System.out.println(words);
		//words.clear();
		//System.out.println(words.isEmpty());
		System.out.println(words.iterator());
}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		
	}


}