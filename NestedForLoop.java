public class Main {
	public static void main(String[] args) {
		
		int x, y;
		
		//Nested for loop
		for (x=0; x <=5; x++)
		{
			for (y=0; y <=5; y++)
			{
				if (y == 5){
					System.out.print(" LastY" + y);
				} else {
					System.out.print(" y" + y);
				}
				
			}
			System.out.println(" x" + x);
		}
		
	}
}
