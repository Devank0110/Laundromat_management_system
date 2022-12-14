package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.LaundroSystem;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminWindow extends JFrame implements Runnable {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField pass;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	

	public void run(){
		try {
			AdminWindow frame = new AdminWindow();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public AdminWindow() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(47, 48, 108, 25);
		contentPane.add(lblNewLabel);
		
		userName = new JTextField();
		userName.setBounds(204, 53, 151, 24);
		contentPane.add(userName);
		userName.setColumns(10);

		pass = new JPasswordField();
		pass.setBounds(204, 130, 151, 25);
		contentPane.add(pass);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(47, 126, 108, 25);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean loginSuccess = LaundroSystem.admin.login(userName.getText(), String.valueOf(pass.getPassword()));
				if(loginSuccess) {
					AdminFunctions af = new AdminFunctions();
					af.setVisible(true);
					dispose();
				}
				else {
					lblNewLabel_1.setText("Wrong Credentials");
					userName.setText("");
					pass.setText("");
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(246, 220, 103, 37);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(152, 173, 108, 25);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow mw = new MainWindow();
				mw.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(76, 220, 103, 37);
		contentPane.add(btnNewButton_1);
	}
}
