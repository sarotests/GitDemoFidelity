package files;

public class PractiseLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =1;
		for (int i =3; i<6; i++)
		{
			//System.out.println("outerloop");
			for (int j = 3; j<=i; j++ )
				
			{
				System.out.print(k*3);
				System.out.print("\t");
				k++;
			}
			
			System.out.println(" ");
			
		}

	}

}
