package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.TextArea;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class telaInicial extends JFrame {
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
					frame.setVisible(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaInicial() {
		setTitle("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 778);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnLogin = new JMenu("Login");
		mnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new telaLogin().setVisible(true);
			}
		});
		menuBar.add(mnLogin);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmCadastrarTalho = new JMenuItem("Cadastrar Talh\u00E3o");
		mntmCadastrarTalho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CadastraTalhao().setVisible(true);
			}
		});
		mnCadastrar.add(mntmCadastrarTalho);
		
		JMenuItem mntmCadastrarProduto = new JMenuItem("Cadastrar Produto");
		mntmCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		mnCadastrar.add(mntmCadastrarProduto);
		
		JMenu mnVendas = new JMenu("Vendas");
		menuBar.add(mnVendas);
		
		JMenuItem mntmProdutosVendidos = new JMenuItem("Vender Produtos");
		mntmProdutosVendidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 new produtoVendido().setVisible(true);
			}
		});
		mnVendas.add(mntmProdutosVendidos);
		
		JMenuItem mntmHistoricoDeVendas = new JMenuItem("Historico de Vendas");
		mntmHistoricoDeVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new historicoVendas().setVisible(true);
			}
		});
		mnVendas.add(mntmHistoricoDeVendas);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});
		
		JMenu mnBeneficiar = new JMenu("Beneficiar");
		menuBar.add(mnBeneficiar);
		
		JMenuItem mntmBeneficiarCaf = new JMenuItem("Beneficiar Caf\u00E9");
		mntmBeneficiarCaf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Beneficiar().setVisible(true);
			}
		});
		mnBeneficiar.add(mntmBeneficiarCaf);
		
		JMenuItem mntmCafsBeneficiados = new JMenuItem("Caf\u00E9s beneficiados");
		mntmCafsBeneficiados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new BeneficiarProduto().setVisible(true);
			}
		});
		mnBeneficiar.add(mntmCafsBeneficiados);
		menuBar.add(mnSair);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Novo");
		
		JButton btnNewButton_1 = new JButton("Alterar");
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setSelectedIcon(new ImageIcon("C:\\Users\\ferna\\OneDrive\\\u00C1rea de Trabalho\\apagar3.jpg"));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblDatahora = new JLabel("Data/Hora");
		
		JLabel lblProduto = new JLabel("Produto");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblLote = new JLabel("Lote");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quantidade");
		
		JLabel lblQualidade = new JLabel("Qualidade");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Data");
		
		JCheckBox chckbxLote = new JCheckBox("Lote");
		
		JCheckBox chckbxProduto = new JCheckBox("Produto");
		
		JButton btnNewButton_2 = new JButton("Filtrar");
		
		JLabel lblInicial = new JLabel(" Inicial");
		
		JLabel lblFim = new JLabel("Final");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		
		JDateChooser dateChooser_1 = new JDateChooser();
		
		JDateChooser dateChooser_2 = new JDateChooser();
		
		JLabel lblRa = new JLabel("RA");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JCheckBox chckbxQualidade = new JCheckBox("Qualidade");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnApagar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(145)
					.addComponent(btnNewButton_2)
					.addContainerGap(279, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblRa)
						.addComponent(lblLote)
						.addComponent(lblProduto)
						.addComponent(lblDatahora)
						.addComponent(lblNewLabel)
						.addComponent(lblQualidade))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox)
										.addComponent(chckbxLote))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(6)
											.addComponent(lblInicial)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblFim)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(dateChooser_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(chckbxProduto)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(chckbxQualidade)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnApagar)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblDatahora)
									.addComponent(chckbxNewCheckBox)
									.addComponent(lblFim)
									.addComponent(lblInicial))
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblProduto)
								.addComponent(comboBox, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxLote)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLote)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxProduto)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(27)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(31)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblQualidade))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblRa)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxQualidade)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(139))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(dateChooser_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Data", "Lote", "Descri\u00E7\u00E3o", "Talh\u00E3o", "Quantidade", "Qualidade", "RA"
			}
		));
		table.getColumnModel().getColumn(5).setMinWidth(25);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
	}
}
