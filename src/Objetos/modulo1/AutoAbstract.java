package Objetos.modulo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.*;

public abstract class AutoAbstract implements IFuncao{
	private Map<Integer,Executavel> script = new TreeMap<>();
	private Robot bot;
	
	protected AutoAbstract() throws AWTException{
		setBot(new Robot());
	}
	public abstract void play();
	public abstract void stop();
	public void add(Integer key ,Executavel executavel) {
		executavel.setRobot(bot);
		script.put(key, executavel);
	}
	public Robot getBot() {
		return bot;
	}
	public void setBot(Robot bot) {
		this.bot = bot;
	}
	public Map<Integer,Executavel> getScript() {
		return script;
	}
	public void setScript(Map<Integer,Executavel> script) {
		this.script = script;
	}
	
	
}
