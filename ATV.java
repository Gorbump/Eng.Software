package ATV;

public class ATV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lua("Exemplo");
		
		
		
	}
		
		public static void lua (String p) {
			for(int i=0; i<p.length();i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(p.charAt(j));
			}
			System.out.println();
			}
		}
		
}

