package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.components.JSpinField;
import java.awt.Button;

public class BeneficiarProduto extends JFrame {

	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField textField_6;
	

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
	public BeneficiarProduto() {
		setTitle("Produto Beneficiado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1100, 718);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_1 = new JButton("Alterar");
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setSelectedIcon(new ImageIcon("C:\\Users\\ferna\\OneDrive\\\u00C1rea de Trabalho\\apagar3.jpg"));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblDatahora = new JLabel("Data");
		
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
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BeneficiarProduto.this.setVisible(false);
			}
		});
		
		JLabel lblUmidade = new JLabel("Umidade");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JCheckBox chckbxUmidade = new JCheckBox("Umidade");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel label = new JLabel("");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblTotalDaQuebra = new JLabel("Total da Quebra");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(662, Short.MAX_VALUE)
					.addComponent(btnCancelar)
					.addGap(75))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLote)
						.addComponent(lblProduto)
						.addComponent(lblDatahora)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(lblUmidade)
							.addComponent(lblQualidade)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
											.addGap(27)
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(23)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(chckbxUmidade)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(chckbxProduto)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(chckbxNewCheckBox)
												.addComponent(chckbxLote))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(18)
													.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(6)
													.addComponent(lblInicial)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(26)
													.addComponent(lblFim)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(dateChooser_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))))
							.addContainerGap(32, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnApagar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(239)
							.addComponent(btnNewButton_2)
							.addGap(152)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
							.addComponent(lblTotalDaQuebra)
							.addGap(18)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(19))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_1)
								.addComponent(btnApagar)
								.addComponent(label)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTotalDaQuebra))))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblDatahora)
									.addComponent(chckbxNewCheckBox)
									.addComponent(lblInicial)
									.addComponent(lblFim))
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
								.addComponent(chckbxProduto)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(chckbxUmidade)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQualidade))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUmidade)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(79))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(dateChooser_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(242)
							.addComponent(btnCancelar)
							.addGap(97))))
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
				"Data", "Lote", "Descri\u00E7\u00E3o", "Quantidade", "Qualidade", "Umidade", "Quebra"
			}
		));
		table.getColumnModel().getColumn(4).setMinWidth(25);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
	}
}
