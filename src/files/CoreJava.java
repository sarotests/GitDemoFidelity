package files;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,3,5,6};
		
		int[] ar1 = new int [5];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1 [2] = 3;
		ar1 [3] = 4;
		ar1[4] = 7;
		
		
		System.out.println(arr[4]);
		
		String [] players = new String [3];
		
		players [0] = "leo" ;
		players [1] = "Ron" ;
		players [2] = "Ney" ;
		
		for (int i = players.length -1 ; i >= 0; i--)
			
		{
		
		
		System.out.println(players[i]);
		
		}
		
		for (int a : ar1)
		{
			if (a % 2 == 0)
			{
			
				System.out.println(a);
				break;
			}
			else 
			{
			System.out.println(a + "is not a multiple of 2");
			}
		
		}
	}

}
