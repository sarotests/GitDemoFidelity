package files;

public class CoreJavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoreJavaMethods d = new CoreJavaMethods();
		String d1 = d.getData();
		System.out.println(d1);
		String d2 = getDOB();
		System.out.println(d2);
		
		ReusableMethods d3 = new ReusableMethods();
		String d4 = d3.getCompany();
		System.out.println(d4);

	}
	
	public String  getData()
	{
	System.out.println("Saro");	
	return "Fidelity"; 
	}
	
	public static String getDOB()
	
	{
	
	return "Enter DOB";
	}
	


}
