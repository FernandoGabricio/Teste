package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class Beneficiar extends JFrame {

	private JPanel contentPane;

	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeneficiarProduto frame = new BeneficiarProduto();
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
	public Beneficiar() {
		setTitle("Beneficiamento de Produto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 882, 553);
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Iniciar Beneficiamento");
		
		JButton btnApagar = new JButton("Encerrar Beneficiamento");
		btnApagar.setSelectedIcon(new ImageIcon("C:\\Users\\ferna\\OneDrive\\\u00C1rea de Trabalho\\apagar3.jpg"));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblDatahora = new JLabel("Data/Hora");
		
		JLabel lblProduto = new JLabel("Produto");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblLote = new JLabel("Lote");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Entrada");
		
		JLabel lblQualidade = new JLabel("Sa\u00EDda");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnCalcularQuebra = new JButton("=");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			Beneficiar.this.setVisible(false);
				
			}
		});
		
		JDateChooser dateChooser = new JDateChooser();
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(16)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblProduto)
								.addComponent(lblDatahora)
								.addComponent(lblLote)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnApagar, Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
												.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(129)
											.addComponent(lblTotal))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(33)
											.addComponent(lblQualidade)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnCalcularQuebra, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
											.addComponent(btnCancelar)
											.addGap(124))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnApagar)
						.addComponent(lblTotal)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDatahora)
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduto)
						.addComponent(comboBox, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLote)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQualidade)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCalcularQuebra, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(66))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Key", "Data/Hora", "Produto", "Descri\u00E7\u00E3o", "Lote", "QuantidadeEtrada"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(64);
		table.getColumnModel().getColumn(2).setPreferredWidth(64);
		table.getColumnModel().getColumn(4).setPreferredWidth(49);
		table.getColumnModel().getColumn(5).setPreferredWidth(105);
		table.getColumnModel().getColumn(5).setMinWidth(25);
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
	}
}