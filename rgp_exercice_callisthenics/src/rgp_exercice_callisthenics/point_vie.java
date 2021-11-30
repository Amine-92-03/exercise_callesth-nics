package rgp_exercice_callisthenics;

public class point_vie {
	static int point_de_vie=1000;
	static void attaqué() {
		if (point_de_vie>0) {
			point_de_vie-=degat.affecter();
			vivant_oupas.verify_mort() ;
			System.out.println(point_de_vie);
	}
	}
	static 	void sur_dose() {
		if(point_de_vie>=1000) {
			point_de_vie=1000;
		}
	} 
	static void recevoir_soins() {
		if(vivant_oupas.affecter_valeur()==1 && point_de_vie<1000 && point_de_vie>0 ) {
		   point_de_vie+=soin.affecter_valeur_soins();
		   sur_dose();
		   System.out.println(point_de_vie);
		}
	}
	static boolean negatif_sign()
	{
		if(point_de_vie<=0)
		{
			point_de_vie=0;
			return true;
		}
		return false;
	}
}
