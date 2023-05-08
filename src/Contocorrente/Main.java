package Contocorrente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContoCorrente conto1 = new ContoCorrente("Grossi Mario",0);
		System.out.println("Saldo conto:" + conto1.restituisciSaldo());
		
		try {
			conto1.preleva(1750.5);
			System.out.println("Saldo conto:" + conto1.restituisciSaldo());
		}catch(BancaException e){
			System.out.println("errore durante il prelievo" + e);
			e.printStackTrace();
		}
		
		ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0,1500);
		conto2.stampaSaldo();
		try {
			conto2.preleva(2000);
			conto2.stampaSaldo();
		}catch(BancaException e){
			System.out.println("Errore durante il prelievo:" + e);
			e.printStackTrace();
		}
	}

}
