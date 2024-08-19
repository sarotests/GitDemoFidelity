package files;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = new int [2][3];
		
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 6;
		a[1][0] = 3;
		a[1][1] = 15;
		a[1][2] = 12;
		
		int max = a[0][0] ;
		
		
		for (int i =0; i<2; i++)
		{
			
			for (int j =0; j<3; j++)
			{ 
				//System.out.print(a[i][j]);
				//System.out.print("\t");
				
				if(a[i][j]> max)
				{
					max = a[i][j];
				}
			}
				
		}
		System.out.println(max);
	}

}
