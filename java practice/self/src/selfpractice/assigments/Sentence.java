package selfpractice.assigments;

import java.util.HashMap;

public class Sentence {
	

	public static void main(String[] args) {
	Line sent = new Line();
	String line = "This is a very very good tool is a";
	sent.words(line);
	//System.out.println(line.hashCode());
} 
	
}

class Line {
	
	public void words(String sentence)	{
		
		String[] word = sentence.split(" ");//split from space
		HashMap<String, Integer> wordNcount = new HashMap<String,Integer>();
		for(String ss: word){
			//System.out.println(ss);
			Integer n= wordNcount.get(ss);
			n = (n==null) ? 1:++n; 
			wordNcount.put(ss,n);
			
			
		}
		System.out.print(wordNcount);

	}
}