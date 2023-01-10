package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class bebidagui extends JFrame {

	private JPanel contentPane;
	private JPanel painelCadastro;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblQtde;
	private JTextField textField;
	private JLabel lblValor;
	private JTextField textField_1;
	private JButton btnSalvar;
	private JButton btnExcluir;
	private JButton btnLimpar;
	private JTable tabela;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bebidagui frame = new bebidagui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bebidagui() {
		setTitle("Bebida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		painelCadastro = new JPanel();
		painelCadastro.setBorder(new TitledBorder(null, "Dados da Bebida", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCadastro.setBounds(10, 24, 192, 330);
		contentPane.add(painelCadastro);
		
		lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		painelCadastro.add(lblNome);
		
		textNome = new JTextField();
		painelCadastro.add(textNome);
		textNome.setColumns(10);
		
		lblQtde = new JLabel("Quantidade");
		painelCadastro.add(lblQtde);
		
		textField = new JTextField();
		textField.setText("0");
		painelCadastro.add(textField);
		textField.setColumns(10);
		
		lblValor = new JLabel("Valor");
		painelCadastro.add(lblValor);
		
		textField_1 = new JTextField();
		textField_1.setText("0.0");
		painelCadastro.add(textField_1);
		textField_1.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		painelCadastro.add(btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		painelCadastro.add(btnExcluir);
		
		btnLimpar = new JButton("Limpar");
		painelCadastro.add(btnLimpar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 32, 224, 322);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
	}
}
