package entites;

import java.util.Date;


public class retrait extends operation {

		public retrait() {
			super();
		}

	public retrait (Date date, int montant, compte compte) {
		super (date, montant, compte);
	}
		
}
