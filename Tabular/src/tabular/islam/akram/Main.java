package tabular.islam.akram;

import java.util.LinkedList;
import java.util.Scanner;

public class Main extends Grouping {

	public static void pressAnyKeyToContinue() {
		System.out.println("Press \"Enter\" to start");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
	public Main(MinTerm[] minTerms) {
		super(minTerms);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MinTerm[] testArray = new MinTerm[1000];
		LinkedList<Object> tempp = new LinkedList<Object>();
		System.out.println("Welcome to Prime Implicants calculator.. ");
		System.out.println("1.Start");
		System.out.println("2.User Manual \"must have a look if first time\"");
		int f = s.nextInt();
		switch (f) {
		case 1:
			break;
		case 2:
			System.out.println("Here you can calculate the prime implicants of a function");
			System.out.println("up to 10 binary digits number , \"1024\" ");
			System.out.println("Enter the minterms in the form of E(0 1 2 3 4) first");
			System.out.println("then enter dontcares after then");
			System.out.println("\n");
			pressAnyKeyToContinue();
			break;
		}
		System.out.println("Please enter the number of variables");
		int variablesCount = s.nextInt();
		System.out.println("Please Enter Lettering Styel => \n1.\"ABCD\",\n2.\"WXYZ\" (for 4 variables only)");
		int chosen = s.nextInt();
		System.out.println("Please enter minterms equal to 1. \"Enter a negative value when u finish\"");
		int breaker = 0, k = 0, count = 0;
		while (breaker == 0) {
			int term = s.nextInt();
			if(term < 0) {
				break;
			}
			MinTerm temp = new MinTerm(term, false, tempp);
			testArray[k] = temp;
			k++;
			count++;
		}
		System.out.println("Please enter \"dont care\" minterms.  \"Enter a negative value when u finish \"");
		breaker = 0;
		while (breaker == 0) {
			int term = s.nextInt();
			if(term < 0) {
				break;
			}
			MinTerm temp = new MinTerm(term, true, tempp);
			testArray[k] = temp;
			k++;
			count++;
		}
		MinTerm[] testArray1 = new MinTerm[count];
		for (int i = 0; i < count; i++) {
			testArray1[i] = testArray[i];
		}
		for (int i = 0; i < count - 1; i++) {
			if (testArray1[i].value > testArray1[i + 1].value) {
				MinTerm tempo = testArray1[i];
				testArray1[i] = testArray1[i + 1];
				testArray1[i + 1] = tempo;
			}
		}
		Grouping test = new Grouping(testArray1);
		int sizee = 0;
		for (int i = 0; i < testArray1.length; i++) {
			int temppp = numOfOnes(testArray1[i].value);
			if (temppp > sizee) {
				sizee = temppp;
			}
		}
		Petrick hoba = new Petrick();
		test.groups(testArray1, sizee);
		hoba.toArrayOfMintermsRepresntation(testArray1, primeImplicants);
		hoba.petricMethod();
		LinkedList<Object> yarab = new LinkedList<Object>();
		yarab = hoba.solutions(primeImplicants);
		/*
		 * for (int i = 0; i < test.primeImplicantsCounter; i++) {
		 * System.out.print(test.primeImplicants[i].value);
		 * System.out.print("("); for (int j = 0; j <
		 * test.primeImplicants[i].diffList.size(); j++) { int diff = (int)
		 * test.primeImplicants[i].diffList.get(j); System.out.print(diff +
		 * ", "); } System.out.print(")"); System.out.println(); }
		 */
		// int officialSize = arrayIndex(testArray1);
		int iii = 0;
		int officialSize = variablesCount;
		for(int o = 0; o < yarab.size(); o++) {
		String ans = EssentialsCalc.printingLetteral((MinTerm[]) yarab.get(o), officialSize, chosen);
		System.out.println("the solution num "+ (o+1) + " is " +ans);
		}
	}

}
