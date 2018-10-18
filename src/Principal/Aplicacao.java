package Principal;

import java.awt.*;

import javax.swing.*;

import Frames.FrameHealing;


public class Aplicacao extends JFrame{
	
	private static double versao = 0.0; 
	
	private Container container = this.getContentPane();
	
	private JPanel painelCentro = new JPanel();
	private JPanel painelNorte = new JPanel();
	private JPanel painelSul = new JPanel();
	private JPanel painelLeste = new JPanel();
	private JPanel painelOeste = new JPanel();
	
	
	
	private JButton botaoLeste = new JButton(">>");
	
	
	public Aplicacao() {
		super("AutoHealing v"+versao);
		
		modelaFrame();
		
		//criação da tela principal
		container.setLayout(new BorderLayout());
		container.add(painelNorte, BorderLayout.NORTH);
		container.add(painelLeste, BorderLayout.EAST);
		container.add(painelSul, BorderLayout.SOUTH);
		container.add(painelOeste, BorderLayout.WEST);
		container.add(painelCentro, BorderLayout.CENTER);
		painelCentro.setBackground(Color.BLUE);
		
		
		//parte leste
		painelLeste.setLayout(new GridLayout(1,0));
		painelLeste.add(botaoLeste);
		
		botaoLeste.addActionListener(e -> botaoLesteClick());
		
		
		
		
		
		
		this.pack();	
	}
	
	private boolean isBotaoLesteOpen = true;
	private FrameHealing frameHealing = new FrameHealing();
	private void botaoLesteClick() {
		
		
		if(isBotaoLesteOpen) {
			frameHealing.setVisible(true);
			botaoLeste.setText("<<");
			
		}else {
			frameHealing.setVisible(false);
			botaoLeste.setText(">>");
		}
		isBotaoLesteOpen = !isBotaoLesteOpen;
	}
	
	private void modelaFrame() {		
		this.setAlwaysOnTop(false);
		//this.setResizable(false);
		//this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		
	}
	public static void main(String[]args) {
		new Aplicacao().setVisible(true);
	}
}
