package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.LaundroSystem;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AdminUpdateStatus extends JFrame {

	private JPanel contentPane;
	private JTextField IdField;
	private JTextField statusField;
	private JTextField weightField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUpdateStatus frame = new AdminUpdateStatus();
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
	public AdminUpdateStatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID No");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(60, 29, 75, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate.setBounds(60, 86, 75, 25);
		contentPane.add(lblDate);
		
		IdField = new JTextField();
		IdField.setBounds(190, 29, 151, 25);
		contentPane.add(IdField);
		IdField.setColumns(10);
		
		JLabel lblDate_1 = new JLabel("Status");
		lblDate_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate_1.setBounds(60, 189, 75, 25);
		contentPane.add(lblDate_1);


		statusField = new JTextField();
		statusField.setColumns(10);
		statusField.setBounds(190, 189, 151, 25);
		contentPane.add(statusField);
		
		JLabel lblDate_1_1 = new JLabel("Weight (Kg)");
		lblDate_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate_1_1.setBounds(60, 250, 115, 25);
		contentPane.add(lblDate_1_1);
		
		weightField = new JTextField();
		weightField.setColumns(10);
		weightField.setBounds(190, 250, 151, 25);
		contentPane.add(weightField);
		
		JComboBox<String> yearBox = new JComboBox<String>();
		yearBox.setModel(new DefaultComboBoxModel<>(new String[] {"2021", "2022", "2023", "2024"}));
		yearBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yearBox.setBounds(192, 86, 76, 25);
		contentPane.add(yearBox);
		
		JComboBox<String> monthBox = new JComboBox<String>();
		monthBox.setModel(new DefaultComboBoxModel<>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		monthBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		monthBox.setBounds(300, 86, 103, 25);
		contentPane.add(monthBox);
		
		JComboBox<String> dateBox = new JComboBox<String>();
		dateBox.setModel(new DefaultComboBoxModel<>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dateBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dateBox.setBounds(448, 86, 52, 25);
		contentPane.add(dateBox);
		
		JButton btnNewButton = new JButton("Update Status");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = IdField.getText();
				String status = statusField.getText();

				int year = Integer.parseInt(yearBox.getSelectedItem().toString());
				int month = Integer.parseInt(monthBox.getSelectedItem().toString());
				int dateEntered = Integer.parseInt(dateBox.getSelectedItem().toString());
				
				LocalDate date = LocalDate.of(year, month, dateEntered);

				LaundroSystem.admin.updateStatus(id, date, status);
				
				
			}
		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(335, 345, 165, 39);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFunctions af = new AdminFunctions();
				af.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(165, 346, 103, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblYear.setBounds(190, 135, 76, 25);
		contentPane.add(lblYear);
		
		JLabel lblDate_1_1_1 = new JLabel("Month");
		lblDate_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate_1_1_1.setBounds(316, 135, 76, 25);
		contentPane.add(lblDate_1_1_1);
		
		JLabel lblDate_1_1_1_1 = new JLabel("Date");
		lblDate_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate_1_1_1_1.setBounds(448, 135, 57, 25);
		contentPane.add(lblDate_1_1_1_1);
		
		
	}
}
