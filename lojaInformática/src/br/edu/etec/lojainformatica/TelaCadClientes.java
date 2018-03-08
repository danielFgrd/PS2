package br.edu.etec.lojainformatica;

//eventos
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//bibliotecas para coneção SQL
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//componentes gráficos
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


import br.edu.etec.lojainformatica.model.Cliente;
/*import br.edu.etec.lojainformatica.persistence.ClienteJdbcDAO;
import br.edu.etec.lojainformatica.persistence.JdbcUtil;
*/

public class TelaCadClientes extends TelaDeCadastro {
		
	Cliente cliente = new Cliente();
	
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField();
	
	JLabel lblEndereco = new JLabel("Endereço:");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblFone = new JLabel("Telefone:");
	JTextField txtFone = new JTextField();
	
	JLabel lblEmail = new JLabel("Email:");
	JTextField txtEmail = new JTextField();
	
	
	public TelaCadClientes() {
		super(4,2);//quatro linhas por duas colunas //super porque esse construtor é da super classe
		//na hora de adicionar os componentes considere a ordem deles.
		//adicionando os componentes aos paineis pré-criados na classe TelaDeCadastro
		this.painelParaCampos.add(lblNome);
		this.painelParaCampos.add(txtNome);
		
		this.painelParaCampos.add(lblEndereco);
		this.painelParaCampos.add(txtEndereco);
		
		this.painelParaCampos.add(lblFone);
		this.painelParaCampos.add(txtFone);
		
		this.painelParaCampos.add(lblEmail);
		this.painelParaCampos.add(txtEmail);
		

		System.out.println("terminado de adicionar os campos, adicione agora acctionListener...");
		
		
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(250,80));
		this.painelDeListagem.add(list);

		
		
		this.btnLimpar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					TelaCadClientes.this.limparFormulario();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			
		});
		
		this.btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					TelaCadClientes.this.salvar();
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		this.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelaCadClientes.this.cancelar();
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		});
		
		this.btnListar.addActionListener(new ActionListener(){
			public void  actionPerformed(ActionEvent e) {
				try {
					TelaCadClientes.this.listar();
				}
				catch (SQLException e1){
					e1.printStackTrace();
				}
					
				
			}
		});
	}


	@Override
	void limparFormulario() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	void salvar() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	void cancelar() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	void alterar() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	void excluir() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	void listar() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	/*
	
	@Override
	void limparFormulario() {
		System.out.println("voidLimparFormulario() {....");
		this.txtNome.setText("");
		this.txtEndereco.setText("");
		this.txtFone.setText("");
		this.txtEmail.setText("");
	}
	@Override
	void salvar() {
		String salvarUoAlterar = "salvar";
		//o botão salvar vai salvar ou alterar . Se tiver ID ele
		//altera senão salva
		String id = this.txtId.getText();
		int idInt = -1;
		
		try {
			idInt = Integer.parseInt(id);
			salvarUoAlterar = "alterar";//se deu pra converter num int então altera		
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		
		try {
			this.cliente.setNome(this.txtNome.getText());
			this.cliente.setEndereco(this.txtEndereco.getText());
			this.cliente.setFone(this.txtFone.getText());
			this.cliente.setEmail(this.txtEmail.getText());
			
			
			//Connection connection = JdbcDAO.getConnection();
			//ClienteJdbcDAO clienteJdbcDAO = new ClienteJdbcDAO(connection);
		}
		catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}
	@Override
	void cancelar() {
		this.setVisible(false);
	}
	@Override
	void alterar() {
		String id = this.txtId.getText();
		try {
			int idInt = Integer.parseInt(id);
			Connection conn = JdbcUtil.getConnection();
			ClienteJdbcDAO	 clenteJdbcDAO = new ClienteJdbcDAO(conn);
			Cliente cli = ClienteJdbcDAO.fingById(idInt);
			if (cli != null) {
				this.txtNome.setText(cli.getNome());
				this.txtEndereco.setText(cli.getEndereco());
				this.txtEmail.setText(cli.getEmail());
				this.txtFone.setText(cli.getFone());
			}
			else 
				JOptionPane.showMessageDialog(null, "Não há clientes nesse ID", "Mensagem");
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	void listar() throw SQLException {
		Connection conn;
		try {
			conn = JdbcUtil.getConnection();
			ClienteJdbcDAO clienteJdbcDAO = new ClienteJdbcDAO(conn);
			List<Cliente> list = new clienteJdbcDAO.listar();
			String[] strArr = new String[list.size()];
			for(int i = 0; i < list.size()) {
				String id = list.get(id).getIdCliente().toString();
				String nome = list.getId(i).getNome();
				strArr[i] = id + " - " + nome;
			}
			this.list.setListData(strArr);
		}
		catch (ClassNotFoundException ex) {
			//TODO 	auto generate cach block
			ex.printStrackTrace();	
		}
		
	}
	*/
}
