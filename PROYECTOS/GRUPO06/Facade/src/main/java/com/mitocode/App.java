package com.mitocode;

import com.mitocode.facade.CheckFacade;

public class App {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2020", "08/07/2020", "Lima", "Canc�n");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2020", "08/07/2020", "Lima", "Quito");
	}

}
