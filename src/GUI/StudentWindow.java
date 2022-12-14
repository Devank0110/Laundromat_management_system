package GUI;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentWindow extends JFrame implements Runnable{

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */

	public void run(){
		try {
			StudentWindow frame = new StudentWindow();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public StudentWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton button1 = new JRadioButton("Register");
		buttonGroup.add(button1);
		button1.setBounds(48, 6, 214, 33);
		button1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(button1);
		
		JRadioButton button2 = new JRadioButton("Drop Laundry");
		buttonGroup.add(button2);
		button2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button2.setBounds(48, 55, 193, 33);
		contentPane.add(button2);
		
		JRadioButton button3 = new JRadioButton("Check Status");
		buttonGroup.add(button3);
		button3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button3.setBounds(48, 104, 193, 33);
		contentPane.add(button3);
		
		JRadioButton button4 = new JRadioButton("Check Expenses");
		buttonGroup.add(button4);
		button4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button4.setBounds(48, 158, 193, 33);
		contentPane.add(button4);
		
		JRadioButton button5 = new JRadioButton("Received Laundry");
		buttonGroup.add(button5);
		button5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button5.setBounds(48, 208, 193, 33);
		contentPane.add(button5);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button1.isSelected()) {
					StudentLogin sl = new StudentLogin();
					sl.setVisible(true);
					dispose();
				}
				else if(button2.isSelected()) {
					StudentDropLaundry sdl = new StudentDropLaundry();
					sdl.setVisible(true);
					dispose();
				}
				else if(button3.isSelected()) {
					StudentCheckStatus scs = new StudentCheckStatus();
					scs.setVisible(true);
					dispose();
				}
				else if(button4.isSelected()) {
					StudentCheckExpenses sce = new StudentCheckExpenses();
					sce.setVisible(true);
					dispose();
				}
				else if(button5.isSelected()) {
					StudentReceiveLaundry srl = new StudentReceiveLaundry();
					srl.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(298, 88, 116, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow mw = new MainWindow();
				mw.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(311, 168, 103, 37);
		contentPane.add(btnNewButton_1);
	}
}
