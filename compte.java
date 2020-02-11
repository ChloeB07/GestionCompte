package entites;


import java.util.Date;

public class compte  {
	private String code; 
	private int solde;
	private Date date;
	private client client;
	
	
	public compte(String code, int solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.date = date;
		this.client= client;
		
	}




	public compte() {
		// TODO Auto-generated constructor stub
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getSolde() {
		return solde;
	}


	public void setSolde(int solde) {
		this.solde = solde;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
