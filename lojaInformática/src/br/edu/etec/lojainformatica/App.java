package br.edu.etec.lojainformatica;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class App extends JFrame {
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	
	
	TelaDeCadastro tlaCadCli = new TelaCadClientes();
	TelaDeCadastro tlaCadHard = new TelaCadHardware();
	TelaDeCadastro tlaCadVads = new TelaCadVendas();
	
	
	
	//construtor que faz que dá os parâmetros para se iniciar o JFrame
	public App(){
		this.setVisible(true);
		this.setSize(800, 600);
		// https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html#border
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		configuraMenu();
		this.pack();
	}//Fim do construtor
	
	private void configuraMenu(){
		this.menuBar = new JMenuBar();
		JMenu menuCadastros = new JMenu("CADASTROS");
		
		
		JMenuItem menuItemClientes = new JMenuItem("Clientes");
		menuItemClientes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.print("menuClieActionPerformed...");
				App.this.tlaCadHard.setVisible(false);
				App.this.tlaCadCli.setVisible(true);
				App.this.tlaCadVads.setVisible(false);
				App.this.getContentPane().add(App.this.tlaCadCli, BorderLayout.CENTER);
				
			}
		});
		
	
		menuCadastros.add(menuItemClientes); //adiciona este item ao menu clientes
		
		JMenuItem menuItemHardware = new JMenuItem("Hardware");
		menuItemHardware.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				App.this.tlaCadCli.setVisible(false);
				App.this.tlaCadVads.setVisible(false);
				App.this.tlaCadHard.setVisible(true);
				App.this.getContentPane().add(App.this.tlaCadHard, BorderLayout.CENTER);
				App.this.pack();
				
			}
		});
		
		//menuCadastros.add(menuItemVenda);
		
		this.menuBar.add(menuCadastros);
		this.getContentPane().add(menuBar, BorderLayout.NORTH);
		
	}
	
	public static void main(String[] args){
		
		App app = new App();
		app.setVisible(true);
	}		

}
