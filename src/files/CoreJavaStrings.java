package files;

public class CoreJavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Saro is working in Fidelity with good salary yesss";
		String [] splittedString = s.split("working");
		
		for (String s1 :splittedString)
		{
			System.out.println(s1.trim());
		}
		
		String r = "LEO MES";
		for (int i =0; i<r.length(); i++)
		{
			System.out.println(r.charAt(i));
		}
		

		String r1 = "LEO MES";
		for (int i = r.length()-1; i>= 0; i--)
		{
			System.out.println(r1.charAt(i));
		}
		
		

	}

}
