package pe.uni.colegioapp.controller;

import pe.uni.colegioapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class MateController {
	
	private final MateService mateService;

	public MateController() {
		mateService = new MateService();
	}
		
	public long factorial(int num) {
		return mateService.factorial(num);
	}

} // Fin de MateController
