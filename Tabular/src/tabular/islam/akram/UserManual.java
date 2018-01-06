package tabular.islam.akram;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserManual {

	private JFrame frmUserManual;

	/**
	 * Launch the application.
	 */
	public static void UserManual(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManual window = new UserManual();
					window.frmUserManual.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserManual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUserManual = new JFrame();
		frmUserManual.setTitle("User Manual");
		frmUserManual.getContentPane().setBackground(new Color(245, 245, 220));
		frmUserManual.setBounds(100, 100, 1011, 542);
		frmUserManual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserManual.getContentPane().setLayout(null);
		
		JLabel lblIslam = new JLabel("\u00A9 2017 ISLAM & AKRAM ALL RIGHTS RESERVED");
		lblIslam.setForeground(Color.DARK_GRAY);
		lblIslam.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblIslam.setBounds(744, 480, 251, 24);
		frmUserManual.getContentPane().add(lblIslam);
		
		JLabel lblNewLabel = new JLabel("USER MANUAL");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("Vijaya", Font.PLAIN, 40));
		lblNewLabel.setBounds(334, 22, 285, 40);
		frmUserManual.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\oooooooo\\Desktop\\Step1.png"));
		lblNewLabel_1.setBounds(22, 93, 216, 142);
		frmUserManual.getContentPane().add(lblNewLabel_1);
		
		JLabel lblFirst = new JLabel("\r\nChoose number of variables.\r\n\r\n");
		lblFirst.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirst.setBounds(10, 269, 266, 40);
		frmUserManual.getContentPane().add(lblFirst);
		
		JLabel lblStep = new JLabel("STEP 1");
		lblStep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStep.setBounds(10, 255, 90, 25);
		frmUserManual.getContentPane().add(lblStep);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\oooooooo\\Desktop\\Step2 - Copy.png"));
		lblNewLabel_2.setBounds(320, 93, 233, 142);
		frmUserManual.getContentPane().add(lblNewLabel_2);
		
		JLabel lblStep_1 = new JLabel("STEP 2");
		lblStep_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStep_1.setBounds(334, 255, 60, 18);
		frmUserManual.getContentPane().add(lblStep_1);
		
		JLabel lblNewLabel_3 = new JLabel("Enter your Min Terms and Dont cares");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(332, 275, 340, 25);
		frmUserManual.getContentPane().add(lblNewLabel_3);
		
		JLabel lblRespectivlyAsShown = new JLabel(" respectivly as shown.");
		lblRespectivlyAsShown.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRespectivlyAsShown.setBounds(334, 298, 285, 25);
		frmUserManual.getContentPane().add(lblRespectivlyAsShown);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\oooooooo\\Desktop\\Step3.png"));
		lblNewLabel_4.setBounds(690, 53, 216, 84);
		frmUserManual.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\oooooooo\\Desktop\\Step4.png"));
		lblNewLabel_5.setBounds(690, 156, 216, 96);
		frmUserManual.getContentPane().add(lblNewLabel_5);
		
		JLabel label = new JLabel("     +");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(774, 137, 60, 14);
		frmUserManual.getContentPane().add(label);
		
		JLabel lblStep_2 = new JLabel("STEP 3");
		lblStep_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStep_2.setBounds(711, 255, 70, 25);
		frmUserManual.getContentPane().add(lblStep_2);
		
		JLabel lblChooseTheLettering = new JLabel("Choose the lettering form and ");
		lblChooseTheLettering.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChooseTheLettering.setBounds(690, 277, 283, 25);
		frmUserManual.getContentPane().add(lblChooseTheLettering);
		
		JLabel lblYourAction = new JLabel("your action.");
		lblYourAction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblYourAction.setBounds(690, 298, 134, 25);
		frmUserManual.getContentPane().add(lblYourAction);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\oooooooo\\Desktop\\Step5.png"));
		lblNewLabel_6.setBounds(72, 351, 378, 142);
		frmUserManual.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("1");
		lblNewLabel_7.setForeground(new Color(220, 20, 60));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(32, 68, 46, 14);
		frmUserManual.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("2");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setForeground(new Color(220, 20, 60));
		lblNewLabel_8.setBounds(322, 68, 46, 14);
		frmUserManual.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("3");
		lblNewLabel_9.setForeground(new Color(220, 20, 60));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(664, 68, 46, 14);
		frmUserManual.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("4");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setForeground(new Color(220, 20, 60));
		lblNewLabel_10.setBounds(32, 326, 46, 14);
		frmUserManual.getContentPane().add(lblNewLabel_10);
		
		JLabel lblAnswerWillShow = new JLabel("Answer will show up in this field.");
		lblAnswerWillShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnswerWillShow.setBounds(489, 385, 314, 40);
		frmUserManual.getContentPane().add(lblAnswerWillShow);
		
		JLabel lblStep_3 = new JLabel("STEP 4");
		lblStep_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStep_3.setBounds(489, 368, 63, 25);
		frmUserManual.getContentPane().add(lblStep_3);
		
		JButton btnNewButton = new JButton("CLOSE\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUserManual.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(871, 440, 89, 37);
		frmUserManual.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\oooooooo\\Desktop\\Style\\Home\\backHome.jpg"));
		lblNewLabel_11.setBounds(0, 0, 995, 504);
		frmUserManual.getContentPane().add(lblNewLabel_11);
	}

}
