package br.edu.etec.lojainformatica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.SQLException;

//componentes da tela
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class TelaDeCadastro extends JPanel {
	
	JPanel painelDeBotoes = new JPanel();
	JPanel painelParaCampos = new JPanel();
	JPanel painelDeListagem = new JPanel();
	JButton btnSalvar = new JButton("Salvar");
	JButton btnLimpar = new JButton("Limpar");
	JButton btnCancelar = new JButton("Cancelar");
	JButton btnAlterar = new JButton("Aterar");
	JButton btnListar = new JButton("Listar");
	JTextField txtId = new JTextField("Digite o ID apara alterar");
	JList<String>list;
	
	//construtor
	public TelaDeCadastro(int nLinhas, int nColunas) {
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/layoutlist.html
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);// dis que essa página vai pegar as bordas da onde ela for incerida para adptar o tamnho
		
		
		//Painel para os campos do formulário
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html
		GridLayout layoutParaCampos = new GridLayout(nLinhas, nColunas);
		painelParaCampos.setLayout(layoutParaCampos);
		this.add(painelParaCampos, BorderLayout.CENTER);//adiciona o painel ao painel principal e o coloca no centro com o método estático do Border Layout
		
		//Painel para os botões
		this.painelDeBotoes = new JPanel();
		this.btnSalvar = new JButton("Salvar");
		this.btnLimpar = new JButton("Limpar");
		this.btnCancelar = new JButton("Cancelar");
		this.painelDeBotoes.add(btnSalvar);
		this.painelDeBotoes.add(btnLimpar);
		this.painelDeBotoes.add(btnCancelar);
		this.painelDeBotoes.add(btnListar);
		this.painelDeBotoes.add(btnAlterar);
		this.painelDeBotoes.add(txtId);
		
		
		//Adiciona no painel De tela de cadastro o painel de botões e dizendo onde ele deve ficar.
		this.add(painelDeBotoes, BorderLayout.SOUTH);
		
	}
	
	abstract void limparFormulario() throws SQLException;
	abstract void salvar() throws SQLException;
	abstract void cancelar() throws SQLException;
	abstract void alterar() throws SQLException;
	abstract void excluir() throws SQLException;
	abstract void listar() throws	SQLException;
		

}
