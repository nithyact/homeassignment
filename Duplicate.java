package weekone.homeassignment;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="this is a program will remove the duplicate the from duplicate remove program";
		String []d =input.split(" ");
		for ( int i=0;i< d.length;i++ ) {
			for(int j=i+1;j<d.length;j++) {
				if(d[i].equalsIgnoreCase(d[j])) {
					d[j]="--";
					
				}
			}
			
		}
		String newStr = "";
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
			if(d[i]!="--") {
				newStr = newStr + d[i] + " ";
			}
			
		}
		
		System.out.println(newStr);

	}

}
