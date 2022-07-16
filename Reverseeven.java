package weekone.homeassignment;

public class Reverseeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] q = { "all", "the", "very", "best" };
		Reverseeven word = new Reverseeven();

		for (int i = 0; i < q.length; i++) {
			if (i % 2 == 0) {
				String temp = q[i];
				q[i] = word.reverse(temp);

			}
		}
		for (int i = 0; i < q.length; i++) {
			System.out.println(q[i]);
		}

	}

	public String reverse(String d) {

		char[] ch1 = d.toCharArray();
		char[] rc = new char[ch1.length];

		for (int i = ch1.length - 1; i > -1; i--) {

			rc[ch1.length - 1 - i] = ch1[i];
		}
		String f = new String(rc);
		return f;
	}

}
