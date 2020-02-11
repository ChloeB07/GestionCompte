package entites;


import java.util.Date;

public class compteCourant extends compte {
	
	private int decouvert;



	public compteCourant(String code, int solde, Date date, int decouvert) {
		super(code, solde, date);
		this.decouvert = decouvert;
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}
	


		// TODO Auto-generated constructor stub
	}

	
	
	

