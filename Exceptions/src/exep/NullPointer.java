package exep;

public class NullPointer {

	public static void main(String[] args) {
		try{
			int b=(Integer) null;
			System.out.println(b);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer value");
		}

	}
}
