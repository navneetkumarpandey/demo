package selfpractice.assigments;

public class CountE {

	public static void main(String[] args) {
		String a = "SELENhfasdfnanslrehinfshvirurwesdwesECDFerIUME";
		int len = a.length();
		int Count = 0;
		for(int i = 0; i<len;i++){
			//char test = a.charAt(i);//extracting one character and assigning it to test
			//if (test == 'E') Count++;//comparing value of test with 'E'
			//if (a.charAt(i)=='E')Count++;//doing above in one line
			if(a.toLowerCase().charAt(i)=='e')Count++;//it will convert the character into small letter and then compare
		}
		System.out.println(Count);
}
}
