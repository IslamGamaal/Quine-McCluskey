package tabular.islam.akram;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class OtherSolns {

	private static JFrame frmOtherSolutions;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtherSolns window = new OtherSolns();
					window.frmOtherSolutions.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OtherSolns() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void initialize() {
		frmOtherSolutions = new JFrame();
		frmOtherSolutions.setTitle("Other Solutions\r\n");
		frmOtherSolutions.setBounds(100, 100, 965, 624);
		frmOtherSolutions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOtherSolutions.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmOtherSolutions.setVisible(false);
			}
		});
		btnClose.setBackground(Color.RED);
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClose.setBounds(836, 552, 89, 23);
		frmOtherSolutions.getContentPane().add(btnClose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 11, 903, 530);
		frmOtherSolutions.getContentPane().add(scrollPane);
		
		JTextArea totalAns = new JTextArea();
		scrollPane.setViewportView(totalAns);
		totalAns.setFont(new Font("Courier New", Font.PLAIN, 18));
		
		JLabel label = new JLabel("\u00A9 2017 ISLAM & AKRAM ALL RIGHTS RESERVED");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(10, 558, 251, 24);
		frmOtherSolutions.getContentPane().add(label);
		for(int i = 0; i < GUITabular.totalAns.length; i++) {
			if(GUITabular.totalAns[i] == null)
				break;
			if(totalAns.getText() == "" || totalAns.getText() == null) {
				totalAns.setText("Answer#1: " + GUITabular.totalAns[i] + "\n");
			}
			else {
				totalAns.append("Answer#" + (i+1) + ": " + GUITabular.totalAns[i] + "\n");
			}
		}
	}
}
