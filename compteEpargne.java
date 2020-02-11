package entites;

import java.util.Date;

public class compteEpargne extends compte{
	
	private int taux;
	
	public compteEpargne() {
		super();
		
	}

	public compteEpargne(String code, int solde, Date date) {
		super(code, solde, date);
		// TODO Auto-generated constructor stub
	}

	public compteEpargne(String code, int solde, Date date, int taux) {
		super(code, solde, date);
		this.taux = taux;
	}

	public int getTaux() {
		return taux;
	}

	public void setTaux(int taux) {
		this.taux = taux;
	}
	

}
