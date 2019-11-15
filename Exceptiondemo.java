package pack3;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
			int b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero not allowed");
		}
		catch(NullPointerException e)
		{
			System.out.println("do null check");
		}
		catch(Exception e)
		{
			//e.printStackTrace();works same but for concept
			
			System.out.println(e.getMessage());
		}

	}

}
