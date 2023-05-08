import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci km");
		int km = in.nextInt();
		System.out.println("Inserisci litri");
		int l = in.nextInt();
		
		try {
			if(l > 0) {
				System.out.println(km/l);
			}
		}catch(ArithmeticException e){
			if(l == 0) {				
			System.out.println(e.getMessage());
			System.out.println("Non puoi dividere per 0");
			}
		}finally {
			in.close();
		}
	}

}
