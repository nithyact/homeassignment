package weekone.homeassignment;

public class Intersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 4, 5, 6, 7, 8, 9 };
		int[] c = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[k] = b[j];
					k++;
					

				}
			}
		}
	for(int l=0;l<c.length;l++) {
		System.out.println(c[l]);
	}
	}

}
