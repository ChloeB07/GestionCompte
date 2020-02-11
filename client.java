package entites;

public class client {
	private String nom; 
	private int code;
	
	
	public client(String nom, int code) {
		super();
		this.nom = nom;
		this.code = code;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
