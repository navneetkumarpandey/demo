package selfpractice.assigments;

public class Prime {
	private int count;
	private int value =2;
	Prime(int count){
		this.count = count;
		for(int i=0; i<count;i++){
			int num = returnOnePrime(value);
			System.out.print(num+" ");
			value= num+1;
		}
		
	}
	public int returnOnePrime(int check){
		
		for (int j=2;j<=check-1;){
			if (check%j!=0)j++;
			else {check++; j=2;}
		}
		
		return check;
	}
	
	public static void main(String[] args) {
		 Prime a =new Prime(15);
	
		// TODO Auto-generated method stub

	}

}
