package weekone.homeassignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f="peacock";
		char[] y=f.toCharArray();
		char [] rv = new char[y.length];
		for(int i=0;i< y.length;i++)
		{
			rv[y.length-1-i]=y[i];
		}
		String reverse=new String(rv);
		if(f.equalsIgnoreCase(reverse)) {
			System.out.println("this is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
				

	}

}
