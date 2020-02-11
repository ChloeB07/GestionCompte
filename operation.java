package entites;

import java.util.Date;

public class operation {
	
	private int numero;
	private Date dateOp;
	private int montant;
	private compte compte;
	
	
	

	public operation(int numero, Date dateOp, int montant, entites.compte compte) {
		super();
		this.numero = numero;
		this.dateOp = dateOp;
		this.montant = montant;
		this.compte = compte;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public Date getDateOp() {
		return dateOp;
	}




	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}




	public int getMontant() {
		return montant;
	}




	public void setMontant(int montant) {
		this.montant = montant;
	}




	public compte getCompte() {
		return compte;
	}




	public void setCompte(compte compte) {
		this.compte = compte;
	}




	public operation() {
		// TODO Auto-generated constructor stub
	}

}
