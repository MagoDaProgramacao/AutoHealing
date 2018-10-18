package Objetos.modulo1.Autos;


import java.awt.AWTException;
import java.awt.Robot;

import Objetos.modulo1.AutoAbstract;
import Objetos.modulo1.Executavel;

public class AutoHealing extends AutoAbstract {

	public AutoHealing() throws AWTException {
		super();
		//super.getBot().setAutoDelay(1000); // teste
	}

	@Override
	public void play() {
		//Executavel bot = super.getScript().get(1);
		//bot.executa();
		
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void add(Integer key , Executavel executavel) {
		super.add(key, executavel);	
	}
	
	public String toString() {
		return super.getScript().get(1).toString() +" " + super.getScript().get(3).toString();
	}
	
}
