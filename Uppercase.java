package weekone.homeassignment;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = "hello";
		char[] e = d.toCharArray();
		for (int i = 0; i < e.length; i++) {
			if (i % 2 != 0 && e[i]>96 && e[i]<123) {
				e[i] = (char) (e[i] - 32);
			}
		}
 System.out.println(e);
	}

}
