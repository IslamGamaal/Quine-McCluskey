package tabular.islam.akram;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUITabular {

	private JFrame Trues;
	private JTextField textTRUES;
	private JTextField textDONTCARES;
	private JTextArea textArea;
	public static int officialSize = 4;
	public static int chosen = 1;
	private JTextField OtherText;
	public static String[] totalAns = new String[100];
	public static int globalCount;
	public static MinTerm[] initialTerms = new MinTerm[100];		
	public static String globalAns = "";
	public static int counta;
	private JTextField textField;
	private static String inputTRUE;
	private static String inputDONTCARE;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GUITabular window = new GUITabular();
					window.Trues.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUITabular() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public static int PlusesCount(String a) {
		int count = 0;
		for(int i = 0;i < a.length(); i++) {
			if(a.charAt(i) == '+') {
			    count++;
			}
		}
		return count;
	}
	public static int minPlusesCount(String[] a) {
		int min = 9999;
		int temp = 0;
		for(int i = 0;i < a.length; i++) {
			if(a[i] == null) {
				break;
			}
			temp = PlusesCount(a[i]);
			if(temp < min) {
				min = temp;
			}
		}
		return temp;
	}
	private void initialize() {
		Trues = new JFrame();
		Trues.setTitle("Quine McClusky");
		Trues.getContentPane().setEnabled(false);
		Trues.setBounds(100, 100, 1011, 542);
		Trues.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Trues.getContentPane().setLayout(null);
		
		ButtonGroup bgUP = new ButtonGroup();
		ButtonGroup bgDown = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("1 Variable");
		rb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 1;
			}
		});

		textField = new JTextField();
		textField.setVisible(false);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setForeground(Color.RED);
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNote.setBounds(157, 312, 31, 19);
		Trues.getContentPane().add(lblNote);
		lblNote.setVisible(false);
		
		JLabel lblNote2 = new JLabel(" \"This answer has been exported to a file in your workspace\"");
		lblNote2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNote2.setVisible(false);
		lblNote2.setBounds(193, 314, 380, 16);
		Trues.getContentPane().add(lblNote2);
		textField.setBounds(719, 68, 236, 20);
		Trues.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheTxt = new JLabel("Enter the txt file path exactly");
		lblEnterTheTxt.setBounds(748, 94, 207, 14);
		lblEnterTheTxt.setVisible(false);
		Trues.getContentPane().add(lblEnterTheTxt);
		
		
		JButton ViewMoreBtn = new JButton("<html>View<br />more<br />possible<br />Answers</html>");
		ViewMoreBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OtherSolns kol = new OtherSolns();
				kol.main(null);
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(23, 94, 962, -7);
		Trues.getContentPane().add(separator);
		ViewMoreBtn.setForeground(SystemColor.desktop);
		ViewMoreBtn.setBackground(SystemColor.controlHighlight);
		ViewMoreBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ViewMoreBtn.setToolTipText("");
		ViewMoreBtn.setBounds(843, 383, 74, 86);
		Trues.getContentPane().add(ViewMoreBtn);
		ViewMoreBtn.setVisible(false);
		
		JLabel lblJohn = new JLabel("\u00A9 2017 ISLAM & AKRAM ALL RIGHTS RESERVED");
		lblJohn.setForeground(Color.DARK_GRAY);
		lblJohn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblJohn.setBounds(744, 480, 251, 24);
		Trues.getContentPane().add(lblJohn);
		rb1.setBounds(72, 38, 109, 23);
		Trues.getContentPane().add(rb1);
		bgUP.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("2 Variables");
		rb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 2;
			}
		});
		rb2.setBounds(193, 38, 109, 23);
		Trues.getContentPane().add(rb2);
		bgUP.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("3 Variables");
		rb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 3;
			}
		});
		rb3.setBounds(313, 38, 109, 23);
		Trues.getContentPane().add(rb3);
		bgUP.add(rb3);
		
		JRadioButton rb4 = new JRadioButton("4 Variable");
		rb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 4;
			}
		});
		rb4.setBounds(424, 38, 84, 23);
		Trues.getContentPane().add(rb4);
		bgUP.add(rb4);
		
		JRadioButton rb5 = new JRadioButton("5 Variables");
		rb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 5;
			}
		});
		rb5.setBounds(586, 38, 109, 23);
		Trues.getContentPane().add(rb5);
		bgUP.add(rb5);
		
		JRadioButton rdbtnImportFromFile = new JRadioButton("Import from File");
		rdbtnImportFromFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(true);
				lblEnterTheTxt.setVisible(true);

			}
		});
		rdbtnImportFromFile.setBounds(586, 64, 127, 23);
		Trues.getContentPane().add(rdbtnImportFromFile);
		bgUP.add(rdbtnImportFromFile);
		
		JRadioButton rb6 = new JRadioButton("6 Variables");
		rb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 6;
			}
		});
		rb6.setBounds(719, 38, 109, 23);
		Trues.getContentPane().add(rb6);
		bgUP.add(rb6);
		
		JRadioButton rb7 = new JRadioButton("7 Variables");
		rb7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 7;
			}
		});
		rb7.setBounds(858, 38, 109, 23);
		Trues.getContentPane().add(rb7);
		bgUP.add(rb7);
		
		JRadioButton rb8 = new JRadioButton("8 Variables");
		rb8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 8;
			}
		});
		rb8.setBounds(72, 64, 109, 23);
		Trues.getContentPane().add(rb8);
		bgUP.add(rb8);
		
		JRadioButton rb9 = new JRadioButton("9 Variables");
		rb9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 9;
			}
		});
		rb9.setBounds(192, 64, 109, 23);
		Trues.getContentPane().add(rb9);
		bgUP.add(rb9);
		
		JRadioButton rb10 = new JRadioButton("10 Variables");
		rb10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				officialSize  = 10;
			}
		});
		rb10.setBounds(313, 64, 109, 23);
		Trues.getContentPane().add(rb10);
		bgUP.add(rb10);
		
		JRadioButton rbOTHER = new JRadioButton("other");
		rbOTHER.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OtherText.setVisible(true);
			}
		});
		bgUP.add(rbOTHER);
		rbOTHER.setBounds(424, 64, 60, 23);
		Trues.getContentPane().add(rbOTHER);
		
		
		
		JRadioButton rdbtnAbcd = new JRadioButton("ABCD..");
		rdbtnAbcd.setForeground(Color.BLUE);
		rdbtnAbcd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chosen = 1;
			}
		});
		rdbtnAbcd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAbcd.setBounds(193, 175, 77, 23);
		Trues.getContentPane().add(rdbtnAbcd);
		bgDown.add(rdbtnAbcd);
		
		JRadioButton rdbtnWxyz = new JRadioButton("WXYZ");
		rdbtnWxyz.setForeground(Color.BLUE);
		rdbtnWxyz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chosen = 2;
			}
		});
		rdbtnWxyz.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnWxyz.setBounds(193, 208, 74, 23);
		Trues.getContentPane().add(rdbtnWxyz);
		bgDown.add(rdbtnWxyz);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(124, 335, 715, 134);
		Trues.getContentPane().add(scrollPane);
		scrollPane.setVisible(false);
		JTextArea textAns = new JTextArea();
		textAns.setEditable(false);
		textAns.setText(" ");
		scrollPane.setViewportView(textAns);
		textAns.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textAns.setVisible(false);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(Color.RED);
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textAns.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClear.setBounds(843, 335, 74, 37);
		Trues.getContentPane().add(btnClear);
		btnClear.setVisible(false);
		textAns.setVisible(false);
		JButton btnCalculate = new JButton("Get Minimized Implicants");
		btnCalculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(rbOTHER.isSelected()) {
						officialSize = Integer.parseInt(OtherText.getText());
					}
					if(rdbtnImportFromFile.isSelected()) {
						String path = textField.getText();
						String currentLine;
						try {
							BufferedReader file = new BufferedReader(new FileReader(path));
							currentLine = file.readLine();
							officialSize = Integer.parseInt(currentLine);
							inputTRUE = file.readLine();
							inputDONTCARE = file.readLine();
							if(inputDONTCARE == null) {
								inputDONTCARE = "";
							}
							
						} catch ( IOException e) {
							JOptionPane.showMessageDialog(null, "error in reading file");
						}
						
					}
					else {
						inputTRUE = textTRUES.getText();
						inputDONTCARE = textDONTCARES.getText();
					}
					
					MinTerm[] minTerms = new MinTerm[100];
					LinkedList<Object> tempp = new LinkedList<Object>();
					int count = 0, tempo = 0;
						
						inputTRUE = inputTRUE.replaceAll("\\s+", "");
						inputTRUE = inputTRUE + ",";
						for(int i = 0; i < inputTRUE.length(); i++) {
							if (inputTRUE.length() == 1) {
							    break;
							}
							if(inputTRUE.charAt(i) == ',') {
								String s = inputTRUE.substring(tempo, i);
								tempo = i + 1;
								int minTerm = Integer.parseInt(s);
								MinTerm temp = new MinTerm(minTerm, false, tempp);
								minTerms[count] = temp;
								count++;
							}
						}
						
						inputDONTCARE = inputDONTCARE.replaceAll("\\s+", "");
						inputDONTCARE = inputDONTCARE + ",";
						tempo = 0;
						for(int i = 0; i < inputDONTCARE.length(); i++) {
							if (inputDONTCARE.length() == 1) {
							    break;
							}
							if(inputDONTCARE.charAt(i) == ',') {
								String s = inputDONTCARE.substring(tempo, i);
								tempo = i + 1;
								s = s.replaceAll("\\s+", "");
								int minTerm = Integer.parseInt(s);
								MinTerm temp = new MinTerm(minTerm, true, tempp);
								minTerms[count] = temp;
								count++;
							}
						}
					
						counta = count;
					
						if(count == 0) {
							textAns.setText("Answer is : 0");
							btnClear.setVisible(true);
							textAns.setVisible(true);
							scrollPane.setVisible(true);
							return;
						}
					MinTerm[] testArray1 = new MinTerm[count];
					for (int i = 0; i < count; i++) {
						testArray1[i] = minTerms[i];
					}
					int j = 0;
					boolean swapped = true;
					while (swapped) {
				        swapped = false;
				        j++;
				        for (int i = 0; i <  count - j; i++) {
				            if (testArray1[i].value > testArray1[i + 1].value) {
				            	MinTerm tempoh = testArray1[i];
								testArray1[i] = testArray1[i + 1];
								testArray1[i + 1] = tempoh;
				                swapped = true;
				            }
				        }
				    }
					for(int i = 0;i < count; i++) {
						initialTerms[i] = testArray1[i];
						}
					globalCount  = count;
					if(testArray1[testArray1.length - 1].value >=  java.lang.Math.pow(2,officialSize) ) {
						JOptionPane.showMessageDialog(null, "Please be commited to the number of variables you choosed");
						return;
					}
					for (int i = 0; i < count - 1; i++) {
						if (testArray1[i].value == testArray1[i + 1].value) {
							JOptionPane.showMessageDialog(null, "Please Dont repeat the minterms");
							return;
						}
					}
					Grouping test = new Grouping(testArray1);
					int sizee = 0;
					for (int i = 0; i < testArray1.length; i++) {
						int temppp = Grouping.numOfOnes(testArray1[i].value);
						if (temppp > sizee) {
							sizee = temppp;
						}
					}
					int deffff = 0;
					deffff++;
					test.groups(testArray1, sizee);
					Petrick hoba = new Petrick();
					test.groups(testArray1, sizee);
					hoba.toArrayOfMintermsRepresntation(testArray1, Grouping.primeImplicants);
					hoba.petricMethod();
					LinkedList<Object> yarab = new LinkedList<Object>();
					yarab = hoba.solutions(Grouping.primeImplicants);
					btnClear.setVisible(true);
					scrollPane.setVisible(true);

					textAns.setVisible(true);
					textAns.setText("");
					ViewMoreBtn.setVisible(true);
					//String[] TotalAns = new String[yarab.size()];
					for(int o = 0; o < yarab.size(); o++) {
						totalAns[o] = EssentialsCalc.printingLetteral((MinTerm[]) yarab.get(o), officialSize, chosen);
						}
					String[] minAns = new String[yarab.size()];
					int minPluses = minPlusesCount(totalAns);
					int koko = 0;
					for(int i = 0; i < yarab.size(); i++) {
						if(PlusesCount(totalAns[i]) == minPluses) {
							minAns[koko] = totalAns[i];
							koko++;
						}
					}
					for(int i = 0; i < koko; i++) {
						if(textAns.getText() == " " || textAns.getText() == null) {
							textAns.setText("Answer #" + (i+1) + " : " + minAns[i] + "\n");
						}
						else {
							textAns.append("Answer #" +(i+1) + " : "+ minAns[i] + "\n");
						}
					}
					globalAns = textAns.getText();
					if(count == java.lang.Math.pow(2,officialSize)) {
						textAns.setText("Answer is : 1");
						btnClear.setVisible(true);
						textAns.setVisible(true);
						scrollPane.setVisible(true);

						return;
					}
					OtherSolns othersoln = new OtherSolns();
					String Ans = textAns.getText();
					PrintWriter out = new PrintWriter("Answer.txt");
					out.println(Ans);
					out.close();
					if(rdbtnImportFromFile.isSelected()) {
						lblNote2.setVisible(true);
						lblNote.setVisible(true);
					}
				} catch (Exception ex) {
					if(counta == java.lang.Math.pow(2,officialSize)) {
						textAns.setText("Answer is : 1");
						btnClear.setVisible(true);
						textAns.setVisible(true);
						scrollPane.setVisible(true);

						return;
					} else {
					    JOptionPane.showMessageDialog(null, "Check your entrie errors");
					}
				}
			}
		});
		btnCalculate.setForeground(Color.RED);
		btnCalculate.setBounds(413, 258, 189, 23);
		Trues.getContentPane().add(btnCalculate);
		
		textTRUES = new JTextField();
		textTRUES.setText(" ");
		textTRUES.setBounds(66, 118, 432, 37);
		Trues.getContentPane().add(textTRUES);
		textTRUES.setColumns(10);
		
		textDONTCARES = new JTextField();
		textDONTCARES.setText(" ");
		textDONTCARES.setBounds(602, 118, 353, 37);
		Trues.getContentPane().add(textDONTCARES);
		textDONTCARES.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(563, 64, -19, 15);
		Trues.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Get Prime Implicants");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					ViewMoreBtn.setVisible(false);
					if(rbOTHER.isSelected()) {
						officialSize = Integer.parseInt(OtherText.getText());
					}
					MinTerm[] minTerms = new MinTerm[100];
					LinkedList<Object> tempp = new LinkedList<Object>();
					int count = 0, tempo = 0;
						String inputTRUE = textTRUES.getText();
						inputTRUE = inputTRUE.replaceAll("\\s+", "");
						inputTRUE = inputTRUE + ",";
						for(int i = 0; i < inputTRUE.length(); i++) {
							if (inputTRUE.length() == 1) {
							    break;
							}
							if(inputTRUE.charAt(i) == ',') {
								String s = inputTRUE.substring(tempo, i);
								tempo = i + 1;
								int minTerm = Integer.parseInt(s);
								MinTerm temp = new MinTerm(minTerm, false, tempp);
								minTerms[count] = temp;
								count++;
							}
						}
						String inputDONTCARE = textDONTCARES.getText();
						inputDONTCARE = inputDONTCARE.replaceAll("\\s+", "");
						inputDONTCARE = inputDONTCARE + ",";
						tempo = 0;
						for(int i = 0; i < inputDONTCARE.length(); i++) {
							if (inputDONTCARE.length() == 1) {
							    break;
							}
							if(inputDONTCARE.charAt(i) == ',') {
								String s = inputDONTCARE.substring(tempo, i);
								tempo = i + 1;
								s = s.replaceAll("\\s+", "");
								int minTerm = Integer.parseInt(s);
								MinTerm temp = new MinTerm(minTerm, true, tempp);
								minTerms[count] = temp;
								count++;
							}
						}
						if(count == officialSize * officialSize) {
							textAns.setText("Answer is : 1");
							btnClear.setVisible(true);
							textAns.setVisible(true);
							scrollPane.setVisible(true);

							return;
						}
						else if(count == 0) {
							textAns.setText("Answer is : 0");
							btnClear.setVisible(true);
							textAns.setVisible(true);
							scrollPane.setVisible(true);

							return;
						}
					MinTerm[] testArray1 = new MinTerm[count];
					for (int i = 0; i < count; i++) {
						testArray1[i] = minTerms[i];
					}
					int j = 0;
					boolean swapped = true;
					while (swapped) {
				        swapped = false;
				        j++;
				        for (int i = 0; i <  count - j; i++) {
				            if (testArray1[i].value > testArray1[i + 1].value) {
				            	MinTerm tempoh = testArray1[i];
								testArray1[i] = testArray1[i + 1];
								testArray1[i + 1] = tempoh;
				                swapped = true;
				            }
				        }
				    }
					if(testArray1[testArray1.length - 1].value >= java.lang.Math.pow(2,officialSize) ) {
						JOptionPane.showMessageDialog(null, "Please be commited to the number of variables you choosed");
						return;
					}
					for (int i = 0; i < count - 1; i++) {
						if (testArray1[i].value == testArray1[i + 1].value) {
							JOptionPane.showMessageDialog(null, "Please Dont repeat the minterms");
							return;
						}
					}
					Grouping test = new Grouping(testArray1);
					int sizee = 0;
					for (int i = 0; i < testArray1.length; i++) {
						int temppp = Grouping.numOfOnes(testArray1[i].value);
						if (temppp > sizee) {
							sizee = temppp;
						}
					}
					test.groups(testArray1, sizee);
					btnClear.setVisible(true);
					textAns.setVisible(true);
					scrollPane.setVisible(true);

					String answer = EssentialsCalc.printingLetteral(Grouping.primeImplicants, officialSize, chosen);
					textAns.setText("Prime: \"" + answer+"\"");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Internal Error");
				}
			}
		});
		btnNewButton.setBounds(114, 258, 176, 23);
		Trues.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Show Steps");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = textTRUES.getText();
				String p = textDONTCARES.getText();
				if(s.equals(" ") && p.equals(" ") && rdbtnImportFromFile.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Please Fill in the fields first");
				}
				else {
				btnCalculate.doClick();
				Steps obj = new Steps();
				obj.main(null);
				}
			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(703, 258, 197, 23);
		Trues.getContentPane().add(btnNewButton_1);
		
		JLabel lblEx = new JLabel("Ex: 0, 2, 4, 8, 14");
		lblEx.setForeground(Color.GRAY);
		lblEx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEx.setBounds(66, 93, 113, 14);
		Trues.getContentPane().add(lblEx);
		
		JLabel lblforFourVariables_1 = new JLabel("\"for four variables only\"");
		lblforFourVariables_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblforFourVariables_1.setForeground(SystemColor.textHighlight);
		lblforFourVariables_1.setBounds(273, 213, 176, 14);
		Trues.getContentPane().add(lblforFourVariables_1);
		
		JLabel label = new JLabel("");
		label.setBounds(676, 208, 46, 14);
		Trues.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u2211");
		label_1.setFont(new Font("Courier New", Font.PLAIN, 65));
		label_1.setBounds(530, 98, 43, 69);
		Trues.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u2211");
		label_2.setFont(new Font("Courier New", Font.PLAIN, 65));
		label_2.setBounds(23, 98, 43, 69);
		Trues.getContentPane().add(label_2);
		
		JLabel lblD = new JLabel("d");
		lblD.setFont(new Font("Courier New", Font.PLAIN, 25));
		lblD.setBounds(567, 152, 25, 31);
		Trues.getContentPane().add(lblD);
		
		JLabel label_3 = new JLabel("+");
		label_3.setFont(new Font("Courier New", Font.PLAIN, 23));
		label_3.setBounds(508, 118, 36, 31);
		Trues.getContentPane().add(label_3);
		
		JLabel lbldefault = new JLabel("(Default)");
		lbldefault.setForeground(SystemColor.textHighlight);
		lbldefault.setBounds(508, 42, 60, 14);
		Trues.getContentPane().add(lbldefault);
		
		JLabel label_4 = new JLabel("(Default)");
		label_4.setForeground(SystemColor.textHighlight);
		label_4.setBounds(273, 181, 60, 14);
		Trues.getContentPane().add(label_4);
		
		JLabel lblUserManual = new JLabel("User Manual");
		lblUserManual.setForeground(Color.BLUE);
		lblUserManual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserManual.setBounds(10, 470, 84, 23);
		Trues.getContentPane().add(lblUserManual);
		
		JButton btnNewButton_2 = new JButton("?");
		btnNewButton_2.setBackground(new Color(0, 0, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserManual bgg = new UserManual();
				bgg.UserManual(null);
			}
		});
		btnNewButton_2.setBounds(23, 423, 52, 46);
		Trues.getContentPane().add(btnNewButton_2);
		
		OtherText = new JTextField();
		OtherText.setVisible(false);
		OtherText.setBounds(490, 68, 86, 20);
		Trues.getContentPane().add(OtherText);
		OtherText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setIcon(new ImageIcon("backHome.jpg"));
		lblNewLabel.setBounds(0, 300, 995, 204);
		Trues.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("backHome.jpg"));
		lblNewLabel_1.setBounds(0, 0, 13, 301);
		Trues.getContentPane().add(lblNewLabel_1);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("backHome.jpg"));
		label_5.setBounds(981, 0, 14, 301);
		Trues.getContentPane().add(label_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("backHome.jpg"));
		lblNewLabel_2.setBounds(0, 0, 995, 14);
		Trues.getContentPane().add(lblNewLabel_2);
		
	
		
	}
}

