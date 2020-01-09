package pe.uni.proytarea.service;

public class MCMService {

	public int MCM(int n1, int n2) {
		int mcm;
		MCDService o1 = new MCDService();

		mcm = (n1 * n2) / o1.MCD(n1, n2);

		return mcm;
	}

}
