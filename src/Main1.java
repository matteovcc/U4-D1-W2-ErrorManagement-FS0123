//import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		//1 tentativo
		
		
//		int[] numbers = {2,6,3,1,8};
//		Scanner in = new Scanner(System.in);
//		System.out.println("Inserisci numero");
//		int numero = in.nextInt();
//		
//		try {
//			if(numero <= 10) {
//				numero = numbers[1];
//				System.out.println(Arrays.toString(numbers));
//			}
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}finally {
//			in.close();
//		}
		
		
		// secondo tentativo
		
		
//		int[] numbers = new int[5];
//		for(int i = 0;i < numbers.length;i++) {
//			numbers[i] = (int) (Math.random() * 10) + 1;
//		}
//		System.out.println(Arrays.toString(numbers));
//		Scanner in = new Scanner(System.in);
//		int numero = 1;
//		
//		while(numero !=0) {
//			 System.out.print("Inserisci un numero da 1 a 10 o premi 0 per breakare: ");
//	            try {
//	                numero = in.nextInt();
//	                if (numero == 0) {
//	                	break;
//	                }else if (numero > 10) {
//	                	System.out.println("Il numero deve essere minore di 10");
//	                	continue;
//	                }
//	            }catch(ArrayIndexOutOfBoundsException e ) {
//	            	System.out.println(e.getMessage());
//	            } catch (Exception e) {
//	            	
//	            	System.out.println("non puoi inserire stringhe! metti un numero da 1 a 10" + e.getMessage());
//	            	continue;
//	            }
//	            
//	            numbers[0] = numero;
//	            
//	            System.out.println("NUOVO ARRAY" + Arrays.toString(numbers));
//		}
//		
//		in.close();
		
		int[] numbers =  new int[5];
		for (int i = 0;i <= numbers.length-1;i++) {
			int numRand = (int) (Math.random() * 10);
			numbers[i] = numRand;
		}
		System.out.println(Arrays.toString(numbers));
		
		Scanner in = new Scanner(System.in);
		boolean quit = false;
		int userNumber = 0;
		do {
			System.out.println("Scegli numero da 1 a 10 o scegli 0 per breakare");
			userNumber = in.nextInt();
			if(userNumber == 0) {
				quit = true;
				System.out.println("Hai breakato");
			}else if(userNumber > 10) {
				System.out.println("NO !!! Inserisci numero da 1 a 10!!");
			}else {
				System.out.println("Scegli la posizione dell'array");
				int position = in.nextInt();
				
				try {
					numbers[position - 1] = userNumber;
					System.out.println(Arrays.toString(numbers));
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println(e.getMessage());
				}
			}
		}while(!quit);
		in.close();
		
	}
}
