package Objetos;

import java.awt.AWTException;

import Objetos.modulo1.IFuncao;
import Objetos.modulo1.Autos.*;
import Objetos.modulo1.Classes.Amuleto;
import Objetos.modulo1.Classes.Individual;

public class Personagem { // SINGLETON
	
	private static Personagem INSTANCE = new Personagem();
	
	private IFuncao AutoHealing;
	
	private Personagem() {
		try {
			
			this.AutoHealing = new AutoHealing();
			
			Individual ind = new Individual();
			
			ind.setPressionavel(new Amuleto());
			
			Individual ind2 = new Individual();
			
			ind2.setPressionavel(new Amuleto());
			
			AutoHealing.add(1, ind);
			AutoHealing.add(3, ind2);
			
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Personagem getInstance() {
		return INSTANCE;
	}
	
	public String toString() {
		return this.AutoHealing.toString()+"";
	}
	
}
