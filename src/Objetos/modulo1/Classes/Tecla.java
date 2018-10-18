package Objetos.modulo1.Classes;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public abstract class Tecla implements Pressionavel{
	
	private String nome;
	private int porcentagem;
	private int cooldown;
	private int key;
	private Robot bot; // falta  ACHAR O ROBOT 
	
	
	@Override
	public void pressiona() {
		bot.keyPress(KeyEvent.VK_ALT);
		bot.keyPress(key);
		bot.keyRelease(key);
		bot.keyRelease(KeyEvent.VK_ALT);
	}
	@Override
	public String getNome() {
		return this.nome;
	}
	@Override
	public int getKey() {
		return this.key;
	}

}
