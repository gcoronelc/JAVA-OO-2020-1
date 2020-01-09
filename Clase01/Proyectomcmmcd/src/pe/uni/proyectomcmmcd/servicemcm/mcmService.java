package pe.uni.proyectomcmmcd.servicemcm;

import pe.uni.proyectomcmmcd.servicemcd.mcdService;

public class mcmService {

	public int mcm(int n1, int n2) {

		mcdService service = new mcdService();
		int mcd = service.mcd(n1, n2);
		int mcm = (n1 * n2) / mcd;

		return mcm;

	}
}
