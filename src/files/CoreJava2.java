package files;

import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(81);
		a.add(2);
		a.add(23);
		
		
		System.out.println(a.get(1));
		
		for (int i=0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
			
			System.out.println(a.contains(81));
			
		}
		
		
		

	}

}
