package selfpractice;

class Volume{
	public static void main(String args[]){
		Box b = new Box(5);
		int vol;
		vol = b.height * b.width * b.breadth;
		System.out.println("volume" +" " +vol);
	}
}