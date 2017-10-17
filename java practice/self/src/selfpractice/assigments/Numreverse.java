package selfpractice.assigments;

public class Numreverse {


	public static void main(String args[]) {
		int a[] = {1,2,3,4};
		
		//System.out.println(a[1]);
		int len = a.length;
		int newa[] = new int[len];
		//System.out.println(len);
		for (int i = 0; i< len;i++){
			newa[i] = a[len-1-i];
			System.out.print(newa[i]+" ");
			
		}
		
	}

}
