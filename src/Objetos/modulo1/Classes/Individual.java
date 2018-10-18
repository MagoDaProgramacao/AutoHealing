package Objetos.modulo1.Classes;

import java.awt.Robot;

public class Individual implements IVerificaPressionavel {
	
	private Pressionavel pressionavel;
	private Robot bot;
	
	
	
	@Override
	public boolean verifica() {
		return true;
	}

	@Override
	public Pressionavel getPressionavel() {
		return pressionavel;
	}

	@Override
	public void executa() {
		if(verifica())
			pressionavel.pressiona();
		
		System.out.println(this.toString());
	}

	@Override
	public void setRobot(Robot bot) {
		this.bot = bot;	
	}
	
	@Override public void setPressionavel(Pressionavel pressionavel) {
		this.pressionavel = pressionavel;
	}
	
	@Override
	public String toString() {
		return pressionavel.toString()+" "+bot.toString();
	}

}
