package tabular.islam.akram;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Steps {

	private JFrame frmSteps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Steps window = new Steps();
					window.frmSteps.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Steps() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static int akbar3adadOnes(MinTerm[] a) {
		int sizee = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == null) {
				break;
			}
			int temppp = Grouping.numOfOnes(a[i].value);
			if (temppp > sizee) {
				sizee = temppp;
			}
		}
		return sizee;
	}
	private void initialize() {

		frmSteps = new JFrame();
		frmSteps.setTitle("Steps");
		frmSteps.setBounds(100, 100, 927, 710);
		frmSteps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSteps.getContentPane().setLayout(null);
		JPanel container = new JPanel();
		JScrollPane scrPane = new JScrollPane(container);
		frmSteps.getContentPane().add(scrPane);

		JButton btnNewButton = new JButton("Close\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmSteps.setVisible(false);
				frmSteps.setDefaultCloseOperation(frmSteps.EXIT_ON_CLOSE);
				GUITabular ho = new GUITabular();
				ho.main(null);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 30, 127, 573);
		frmSteps.getContentPane().add(scrollPane);
		
		JTextArea textArea1 = new JTextArea();
		scrollPane.setViewportView(textArea1);
		
		
		
		
		textArea1.setText("");
		JButton btn4 = new JButton("SHOW");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(147, 30, 127, 573);
		frmSteps.getContentPane().add(scrollPane_1);
		JTextArea textArea2 = new JTextArea();
		scrollPane_1.setViewportView(textArea2);
		textArea2.setText("");
		JButton btn5 = new JButton("SHOW");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(284, 30, 139, 573);
		frmSteps.getContentPane().add(scrollPane_2);
		JTextArea textArea3 = new JTextArea();
		scrollPane_2.setViewportView(textArea3);
		textArea3.setText("");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(433, 30, 149, 573);
		frmSteps.getContentPane().add(scrollPane_3);
		JTextArea textArea4 = new JTextArea();
		scrollPane_3.setViewportView(textArea4);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(798, 617, 89, 27);
		frmSteps.getContentPane().add(btnNewButton);
		JButton btn3 = new JButton("SHOW");
		JButton btn2 = new JButton("SHOW");
		JButton btn1 = new JButton("SHOW ");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setVisible(false);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int groupsNum2 = akbar3adadOnes(GUITabular.initialTerms);
				try {
					LinkedList<DoublyLinkedList[]> queue = new LinkedList<DoublyLinkedList[]>();
					queue = Grouping.GroupingSteps;
					DoublyLinkedList[] groupsArray = new DoublyLinkedList[7];
					groupsArray = queue.get(1);
					for (int i = 0; i < groupsNum2; i++) {
						textArea2.append("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n•Group( " + i + " , " + (i + 1) + " )\n┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n");
						if(groupsArray[i] == null) {
							continue;
						}
						NodeDL a = groupsArray[i].head.next;
						for (int j = 0; j < groupsArray[i].size; j++) {
							String print = "⟹" + String.valueOf(a.data.value) + Arrays.toString(a.data.diffList.toArray());
							String AllPrint = textArea2.getText();
							if(AllPrint.contains(print)) {
								a = a.next;
								continue;
							}
							else {
							textArea2.append(print);
							}
							if(a.data.checked) {
								textArea2.append("\t✓\n");
							} else {
							    textArea2.append("\t✘\n");
							}
							a = a.next;
						}
					}
					String kolo = textArea2.getText();
					for(int i = 0 ; i < kolo.length(); i++) {
						if(kolo.charAt(i) == '✓') {
							btn2.setVisible(true);
						}
					}
				} catch (Exception ee) {
					JOptionPane.showMessageDialog(null, "Error in 2");
				}
				
			}
		});
		
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setVisible(false);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int groupsNum3 = akbar3adadOnes(GUITabular.initialTerms) - 1;
				try {
					LinkedList<DoublyLinkedList[]> queue = new LinkedList<DoublyLinkedList[]>();
					queue = Grouping.GroupingSteps;
					DoublyLinkedList[] groupsArray = new DoublyLinkedList[7];
					groupsArray = queue.get(2);
					for (int i = 0; i < groupsNum3; i++) {
						textArea3.append("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n•Group( " + i + " , " + (i + 1) + " , " + (i + 2) + " )\n┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n");
						if(groupsArray[i] == null) {
							continue;
						}
						NodeDL b = groupsArray[i].head.next;
						for (int j = 0; j < groupsArray[i].size; j++) {
							String print = "⟹" + String.valueOf(b.data.value) + Arrays.toString(b.data.diffList.toArray());
							String AllPrint = textArea3.getText();
							if(AllPrint.contains(print)) {
								b = b.next;
								continue;
							}
							else {
							textArea3.append(print);
							}
							if(b.data.checked) {
								textArea3.append("\t✓\n");
							}
							else {
								textArea3.append("\t✘\n");
							}
							b = b.next;
						}
					}
					String kolo = textArea3.getText();
					for(int i = 0 ; i < kolo.length(); i++) {
						if(kolo.charAt(i) == '✓') {
							btn3.setVisible(true);
						}
					}
					
				} catch (Exception eee) {
					JOptionPane.showMessageDialog(null, "Error in 3");
				}
			}
		});
		btn2.setBounds(304, 0, 89, 23);
		frmSteps.getContentPane().add(btn2);
		btn1.setBounds(165, 0, 89, 23);
		frmSteps.getContentPane().add(btn1);
		
		JButton btnNewButton_1 = new JButton("START\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LinkedList<DoublyLinkedList[]> queue = new LinkedList<DoublyLinkedList[]>();
				queue = Grouping.GroupingSteps;
				DoublyLinkedList[] groupsArray = new DoublyLinkedList[7];
				groupsArray = queue.get(0);
				int groupsNum = akbar3adadOnes(GUITabular.initialTerms) + 1;
				try {
					for (int i = 0; i < groupsNum; i++) {
						textArea1.append("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n•Group( " + i + " )\n┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n");
						if(groupsArray[i] == null) {
							continue;
						}
						NodeDL b = groupsArray[i].head.next;
						for (int j = 0; j < groupsArray[i].size; j++) {
							String print = "⟹" + String.valueOf(b.data.value);
							String AllPrint = textArea1.getText();
							if(AllPrint.contains(print)) {
								b = b.next;
								continue;
							}
							else {
							textArea1.append(print);
							}
							if(b.data.checked) {
								textArea1.append("\t✓\n");
							} else {
							    textArea1.append("\t✘\n");
							}
							b = b.next;
						}
					}
					String kolo = textArea1.getText();
					for(int i = 0 ; i < kolo.length(); i++) {
						if(kolo.charAt(i) == '✓') {
							btn1.setVisible(true);
						}
					}
				} catch (Exception eee) {
					JOptionPane.showMessageDialog(null, "Error in 1");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(26, 0, 89, 23);
		frmSteps.getContentPane().add(btnNewButton_1);
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LinkedList<DoublyLinkedList[]> queue = new LinkedList<DoublyLinkedList[]>();
				queue = Grouping.GroupingSteps;
				DoublyLinkedList[] groupsArray = new DoublyLinkedList[7];
				groupsArray = queue.get(3);
				int groupsNum = akbar3adadOnes(GUITabular.initialTerms) - 2;
				try {
					for (int i = 0; i < groupsNum; i++) {
						textArea4.append("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n•Group( " + i + " , " + (i + 1) + " , " + (i + 2)  + " , " + (i + 3) + " )\n┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n");
						if(groupsArray[i] == null) {
							continue;
						}
						NodeDL b = groupsArray[i].head.next;
						for (int j = 0; j < groupsArray[i].size; j++) {
							String print = "⟹" + String.valueOf(b.data.value) + Arrays.toString(b.data.diffList.toArray());
							String AllPrint = textArea4.getText();
							if(AllPrint.contains(print)) {
								b = b.next;
								continue;
							}
							else {
								textArea4.append(print);
							}
							if(b.data.checked) {
								textArea4.append("\t✓\n");
							} else {
							    textArea4.append("\t✘\n");
							}
							b = b.next;
						}
					}
					String kolo = textArea4.getText();
					for(int i = 0 ; i < kolo.length(); i++) {
						if(kolo.charAt(i) == '✓') {
							btn4.setVisible(true);
						}
					}
				} catch (Exception eee) {
					JOptionPane.showMessageDialog(null, "Error in 4");
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3.setBounds(462, 0, 89, 23);
		btn3.setVisible(false);
		frmSteps.getContentPane().add(btn3);
		
		JLabel label = new JLabel("\u00A9 2017 ISLAM & AKRAM ALL RIGHTS RESERVED");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(3, 648, 251, 24);
		frmSteps.getContentPane().add(label);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(592, 30, 149, 573);
		frmSteps.getContentPane().add(scrollPane_4);
		
		JTextArea textArea5 = new JTextArea();
		scrollPane_4.setViewportView(textArea5);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(751, 30, 149, 573);
		frmSteps.getContentPane().add(scrollPane_5);
		
		JTextArea textArea6 = new JTextArea();
		scrollPane_5.setViewportView(textArea6);
		
		
		btn4.setVisible(false);
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LinkedList<DoublyLinkedList[]> queue = new LinkedList<DoublyLinkedList[]>();
				queue = Grouping.GroupingSteps;
				DoublyLinkedList[] groupsArray = new DoublyLinkedList[7];
				groupsArray = queue.get(4);
				int groupsNum = akbar3adadOnes(GUITabular.initialTerms) - 3;
				try {
					for (int i = 0; i < groupsNum; i++) {
						textArea5.append("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n•Group( " + i + " , " + (i + 1) + " , " + (i + 2)  + " , " + (i + 3) + " , " + (i + 4) +  " )\n┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n");
						if(groupsArray[i] == null) {
							continue;
						}
						NodeDL b = groupsArray[i].head.next;
						for (int j = 0; j < groupsArray[i].size; j++) {
							String print = "⟹" + String.valueOf(b.data.value) + Arrays.toString(b.data.diffList.toArray());
							String AllPrint = textArea5.getText();
							if(AllPrint.contains(print)) {
								b = b.next;
								continue;
							}
							else {
								textArea5.append(print);
							}
							if(b.data.checked) {
								textArea5.append("\t✓\n");
							} else {
							    textArea5.append("\t✘\n");
							}
							b = b.next;
						}
					}
					String kolo = textArea5.getText();
					for(int i = 0 ; i < kolo.length(); i++) {
						if(kolo.charAt(i) == '✓') {
							btn5.setVisible(true);
						}
					}
				} catch (Exception eee) {
					JOptionPane.showMessageDialog(null, "Error in 5");
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4.setBounds(622, 0, 89, 23);
		frmSteps.getContentPane().add(btn4);
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LinkedList<DoublyLinkedList[]> queue = new LinkedList<DoublyLinkedList[]>();
				queue = Grouping.GroupingSteps;
				DoublyLinkedList[] groupsArray = new DoublyLinkedList[7];
				groupsArray = queue.get(5);
				int groupsNum = akbar3adadOnes(GUITabular.initialTerms) - 4;
				try {
					for (int i = 0; i < groupsNum; i++) {
						textArea6.append("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n•Group( " + i + " , " + (i + 1) + " , " + (i + 2)  + " , " + (i + 3) + " , " + (i + 4) +" , " + (i + 5) +  " )\n┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n");
						if(groupsArray[i] == null) {
							continue;
						}
						NodeDL b = groupsArray[i].head.next;
						for (int j = 0; j < groupsArray[i].size; j++) {
							String print = "⟹" + String.valueOf(b.data.value) + Arrays.toString(b.data.diffList.toArray());
							String AllPrint = textArea6.getText();
							if(AllPrint.contains(print)) {
								b = b.next;
								continue;
							}
							else {
								textArea6.append(print);
							}
							if(b.data.checked) {
								textArea6.append("\t✓\n");
							} else {
							    textArea6.append("\t✘\n");
							}
							b = b.next;
						}
					}
					
				} catch (Exception eee) {
					JOptionPane.showMessageDialog(null, "Error in 5");
				}
			}
		});
		
		btn5.setVisible(false);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5.setBounds(785, 0, 89, 23);
		frmSteps.getContentPane().add(btn5);
		
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Graph jj = new Graph();
				jj.main(null);
			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBounds(699, 617, 89, 27);
		frmSteps.getContentPane().add(btnNewButton_2);
		String a = GUITabular.globalAns;
		
		JLabel lblAnswerWas = new JLabel("ANSWER WAS");
		lblAnswerWas.setForeground(Color.BLUE);
		lblAnswerWas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnswerWas.setBounds(63, 625, 105, 14);
		frmSteps.getContentPane().add(lblAnswerWas);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(177, 614, 481, 35);
		frmSteps.getContentPane().add(scrollPane_6);
		
		JTextArea textArea = new JTextArea();
		scrollPane_6.setViewportView(textArea);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		String aa = GUITabular.globalAns.substring(0, GUITabular.globalAns.length() - 1);
		textArea.setText(aa);
	
	}
}
