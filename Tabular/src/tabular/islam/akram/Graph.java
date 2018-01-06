package tabular.islam.akram;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graph {

	private JFrame frmGraph;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JLabel lblMinTerms;
	private JSeparator separator;
	private JLabel lblPrimeImp;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JSeparator separator_10;
	private JTextField textField_24;
	private JTextField textField_25;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graph window = new Graph();
					window.frmGraph.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Graph() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGraph = new JFrame();
		frmGraph.setTitle("MAP");
		frmGraph.setAlwaysOnTop(true);
		frmGraph.setAutoRequestFocus(false);
		frmGraph.setBounds(100, 100, 970, 710);
		frmGraph.getContentPane().setLayout(null);
/*		frmGraph.setExtendedState(JFrame.MAXIMIZED_BOTH);
*/		
		separator_1 = new JSeparator();
		separator_1.setBounds(58, 126, 761, -11);
		frmGraph.getContentPane().add(separator_1);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(133, 42, 42, 34);
		textField.setEditable(false);
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		frmGraph.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(179, 42, 42, 34);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_1.setColumns(10);
		frmGraph.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(224, 42, 42, 34);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_2.setColumns(10);
		frmGraph.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(272, 42, 42, 34);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_3.setColumns(10);
		frmGraph.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(318, 42, 42, 34);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_4.setColumns(10);
		frmGraph.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(363, 42, 42, 34);
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_5.setColumns(10);
		frmGraph.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(411, 42, 42, 34);
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_6.setColumns(10);
		frmGraph.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(457, 42, 42, 34);
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_7.setColumns(10);
		frmGraph.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(502, 42, 42, 34);
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_8.setColumns(10);
		frmGraph.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(548, 42, 42, 34);
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_9.setColumns(10);
		frmGraph.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(594, 42, 42, 34);
		textField_10.setEditable(false);
		textField_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_10.setColumns(10);
		frmGraph.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(639, 42, 42, 34);
		textField_11.setEditable(false);
		textField_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_11.setColumns(10);
		frmGraph.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(686, 42, 42, 34);
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_12.setColumns(10);
		frmGraph.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(732, 42, 42, 34);
		textField_13.setEditable(false);
		textField_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_13.setColumns(10);
		frmGraph.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(777, 42, 42, 34);
		textField_14.setEditable(false);
		textField_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_14.setColumns(10);
		frmGraph.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(48, 87, 86, 28);
		textField_15.setEditable(false);
		textField_15.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		frmGraph.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(48, 126, 86, 28);
		textField_16.setEditable(false);
		textField_16.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_16.setColumns(10);
		frmGraph.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(48, 165, 86, 28);
		textField_17.setEditable(false);
		textField_17.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_17.setColumns(10);
		frmGraph.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(48, 204, 86, 28);
		textField_18.setEditable(false);
		textField_18.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_18.setColumns(10);
		frmGraph.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(48, 243, 86, 28);
		textField_19.setEditable(false);
		textField_19.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_19.setColumns(10);
		frmGraph.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(48, 282, 86, 28);
		textField_20.setEditable(false);
		textField_20.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_20.setColumns(10);
		frmGraph.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(48, 321, 86, 28);
		textField_21.setEditable(false);
		textField_21.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_21.setColumns(10);
		frmGraph.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(48, 360, 86, 28);
		textField_22.setEditable(false);
		textField_22.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_22.setColumns(10);
		frmGraph.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setBackground(Color.WHITE);
		textField_23.setBounds(48, 399, 86, 28);
		textField_23.setEditable(false);
		textField_23.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_23.setColumns(10);
		frmGraph.getContentPane().add(textField_23);
		MinTerm[] primeImplicants = new MinTerm[30];
		for(int i = 0 ; i < Grouping.primeImplicantsCounter; i++) {
			primeImplicants[i] = Grouping.primeImplicants[i];
		}
		String s = "";
		if(primeImplicants[0] != null) {
			 s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[0], GUITabular.officialSize, GUITabular.chosen));
		textField_15.setText(s);
		}
		if(primeImplicants[1] != null) {
		s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[1], GUITabular.officialSize, GUITabular.chosen));
		textField_16.setText(s);
		}
		if(primeImplicants[2] != null) {
		s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[2], GUITabular.officialSize, GUITabular.chosen));
		textField_17.setText(s);
		}
		if(primeImplicants[3] != null) {
			s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[3], GUITabular.officialSize, GUITabular.chosen));
			textField_18.setText(s);
			}
		if(primeImplicants[4] != null) {
			s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[4], GUITabular.officialSize, GUITabular.chosen));
			textField_19.setText(s);
			}
		if(primeImplicants[5] != null) {
			s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[5], GUITabular.officialSize, GUITabular.chosen));
			textField_20.setText(s);
			}
		if(primeImplicants[6] != null) {
			s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[6], GUITabular.officialSize, GUITabular.chosen));
			textField_21.setText(s);
			}
		if(primeImplicants[7] != null) {
			s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[7], GUITabular.officialSize, GUITabular.chosen));
			textField_22.setText(s);
			}
		if(primeImplicants[8] != null) {
			s = String.valueOf(EssentialsCalc.printingLetteral2(primeImplicants[8], GUITabular.officialSize, GUITabular.chosen));
			textField_23.setText(s);
			}
		
		
		
		
		
		
		
		
		
		MinTerm[] oldImplicants = new MinTerm[30];
		int countt = 0;
		for(int i = 0 ; i < GUITabular.globalCount; i++) {
			if(GUITabular.initialTerms[i].dontCareCheck == false) {
			oldImplicants[i] = GUITabular.initialTerms[i];
			countt++;
			}
		}
		if(oldImplicants[0] != null) {
			textField.setText(String.valueOf(oldImplicants[0].value));
		}
		if(oldImplicants[1] != null) {
			textField_1.setText(String.valueOf(oldImplicants[1].value));
		}
		if(oldImplicants[2] != null) {
			textField_2.setText(String.valueOf(oldImplicants[2].value));
		}
		if(oldImplicants[3] != null) {
			textField_3.setText(String.valueOf(oldImplicants[3].value));
		}
		if(oldImplicants[4] != null) {
			textField_4.setText(String.valueOf(oldImplicants[4].value));
		}
		if(oldImplicants[5] != null) {
			textField_5.setText(String.valueOf(oldImplicants[5].value));
		}
		if(oldImplicants[6] != null) {
			textField_6.setText(String.valueOf(oldImplicants[6].value));
		}
		if(oldImplicants[7] != null) {
			textField_7.setText(String.valueOf(oldImplicants[7].value));
		}
		if(oldImplicants[8] != null) {
			textField_8.setText(String.valueOf(oldImplicants[8].value));
		}
		if(oldImplicants[9] != null) {
			textField_9.setText(String.valueOf(oldImplicants[9].value));
		}
		if(oldImplicants[10] != null) {
			textField_10.setText(String.valueOf(oldImplicants[10].value));
		}
		if(oldImplicants[11] != null) {
			textField_11.setText(String.valueOf(oldImplicants[11].value));
		}
		if(oldImplicants[12] != null) {
			textField_12.setText(String.valueOf(oldImplicants[12].value));
		}
		if(oldImplicants[13] != null) {
			textField_13.setText(String.valueOf(oldImplicants[13].value));
		}
		if(oldImplicants[14] != null) {
			textField_14.setText(String.valueOf(oldImplicants[14].value));
		}
		
		lblMinTerms = new JLabel("Min Terms");
		lblMinTerms.setBounds(48, 42, 70, 19);
		lblMinTerms.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmGraph.getContentPane().add(lblMinTerms);
		
		separator = new JSeparator();
		separator.setBounds(48, 59, 75, 2);
		frmGraph.getContentPane().add(separator);
		
		lblPrimeImp = new JLabel("Prime Imp.");
		lblPrimeImp.setBounds(48, 62, 73, 19);
		lblPrimeImp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmGraph.getContentPane().add(lblPrimeImp);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(46, 119, 876, 19);
		frmGraph.getContentPane().add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(46, 162, 876, 19);
		frmGraph.getContentPane().add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(46, 198, 876, 19);
		frmGraph.getContentPane().add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setBounds(46, 238, 876, 19);
		frmGraph.getContentPane().add(separator_5);
		
		separator_6 = new JSeparator();
		separator_6.setBounds(46, 278, 876, 19);
		frmGraph.getContentPane().add(separator_6);
		
		separator_7 = new JSeparator();
		separator_7.setBounds(46, 317, 876, 19);
		frmGraph.getContentPane().add(separator_7);
		
		separator_8 = new JSeparator();
		separator_8.setBounds(48, 356, 874, 19);
		frmGraph.getContentPane().add(separator_8);
		
		separator_9 = new JSeparator();
		separator_9.setBounds(48, 394, 874, 19);
		frmGraph.getContentPane().add(separator_9);
		
		JButton btnClose = new JButton("Back");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmGraph.setVisible(false);
			}
		});
		btnClose.setBackground(Color.GREEN);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClose.setBounds(732, 612, 89, 28);
		frmGraph.getContentPane().add(btnClose);
		
		textField_24 = new JTextField();
		textField_24.setBackground(Color.WHITE);
		textField_24.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(828, 42, 42, 34);
		frmGraph.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setBackground(Color.WHITE);
		textField_25.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(880, 42, 42, 34);
		frmGraph.getContentPane().add(textField_25);
	
		
		
	}
}
