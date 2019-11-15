package pack3;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=5;
			//int b=(Integer) null;  null check plz 
			
			int b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException | NullPointerException | ClassCastException e)
		{
			if(e instanceof ArithmeticException)
				System.out.println("don't divide by zero");
			else if(e instanceof NullPointerException)
				System.out.println("null check plz");
			else if(e instanceof ClassCastException)
				System.out.println("checking casting required....");
		}

	}

}
