package pe.uni.proyectomcmmcd.servicemcd;

public class mcdService {

	public int mcd(int n1, int n2) {
		// variables 
		int mcd;
		//proceso
		while (n1 != n2) {
			if (n1 > n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}
		}

		mcd = n1;
		//reporte
		return mcd;
	}
}
