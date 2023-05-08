//import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random ran = new Random();
//		int x = ran.nextInt(1)+10;
//		
//		System.out.println(x);
		
		int[] numbers = {2,6,3,1,8};
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci numero");
		int numero = in.nextInt();
		
		try {
			if(numero < 10) {
				numero = numbers[14];
				System.out.println(Arrays.toString(numbers));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			in.close();
		}
		
		
	}
}
