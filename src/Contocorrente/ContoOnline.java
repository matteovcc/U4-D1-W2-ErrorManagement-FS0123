package Contocorrente;


public class ContoOnline extends ContoCorrente {
	double maxPrelievo;

	public ContoOnline(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) throws BancaException {
		if (x > maxPrelievo) {
			throw new BancaException("il prelievo non è disponibile");
		}else {
		super.preleva(x);
		}
	}
}
