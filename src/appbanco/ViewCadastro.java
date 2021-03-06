package appbanco;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textConta;
	private JTextField textNome;
	private JTextField textSaldo;
	private JRadioButton btnCorrente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastro frame = new ViewCadastro();
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
	public ViewCadastro() {

		Config config = new Config();

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\S\u00E9rgio Botelho Filho\\Pictures\\favicon_io123\\apple-touch-icon.png"));
		setTitle("Cadastro de Conta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Manual");
		mnNewMenu_1.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sobre");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textConta = new JTextField();
		textConta.setBounds(218, 52, 191, 20);
		contentPane.add(textConta);
		textConta.setColumns(10);

		JLabel lblNome123 = new JLabel("Digite seu nome:");
		lblNome123.setForeground(Color.BLACK);
		lblNome123.setBounds(22, 30, 186, 14);
		contentPane.add(lblNome123);

		JLabel lblDigiteONmero = new JLabel("Digite o n\u00FAmero da conta:");
		lblDigiteONmero.setForeground(Color.BLACK);
		lblDigiteONmero.setBounds(22, 55, 186, 14);
		contentPane.add(lblDigiteONmero);

		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(141, 27, 268, 20);
		contentPane.add(textNome);

		textSaldo = new JTextField();
		textSaldo.setColumns(10);
		textSaldo.setBounds(218, 76, 191, 20);
		contentPane.add(textSaldo);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = textNome.getText();
				String conta = textConta.getText();
				String saldo = textSaldo.getText();

				Integer contaInt = Integer.parseInt(conta);
				Double saldoDouble = Double.parseDouble(saldo);

				config.cadastro(nome, contaInt, saldoDouble);
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
			}
		});
		btnNewButton.setBounds(49, 205, 104, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				View view = new View();
				view.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(258, 205, 89, 23);
		contentPane.add(btnNewButton_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Conta Corrente");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Conta Poupan\u00E7a");

		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_1.setSelected(false);
			}
		});
		rdbtnNewRadioButton.setBounds(22, 116, 186, 23);
		contentPane.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setSelected(false);
			}
		});
		rdbtnNewRadioButton_1.setBounds(22, 142, 186, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		JLabel lblDigiteOSalrio = new JLabel("Digite o sal\u00E1rio inicial:");
		lblDigiteOSalrio.setForeground(Color.BLACK);
		lblDigiteOSalrio.setBounds(22, 79, 186, 14);
		contentPane.add(lblDigiteOSalrio);
	}
}
