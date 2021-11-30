package rgp_exercice_callisthenics;

public class vivant_oupas {
	static int vivant=1;
	static void verify_mort() {
		if(point_vie.negatif_sign() || vivant==0) {
			vivant=0;
		}
	}
	static int affecter_valeur()
	{
		return vivant;
	}
}
