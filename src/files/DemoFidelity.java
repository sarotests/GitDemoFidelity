package files;

public class DemoFidelity implements Investment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Investment a = new DemoFidelity();
		a.regulations();
		a.standards();
		DemoFidelity a1 = new DemoFidelity();
		a1.risks();
		a1.risks(0);

	}

	@Override
	public void standards() {
		// TODO Auto-generated method stub
		System.out.println("standards");
	}

	@Override
	public void regulations() {
		// TODO Auto-generated method stub
		System.out.println("regulations");
		
	}
	
	public void risks()
	{
		
		System.out.println("risks");
	}
	
	public void risks(int a)
	{
		System.out.println(a);
	}
	
	

}
