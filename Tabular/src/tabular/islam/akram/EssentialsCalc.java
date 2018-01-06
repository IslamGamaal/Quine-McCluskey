package tabular.islam.akram;

public class EssentialsCalc {
	public static String getCorrectBinary(int a, int officialSize) {
		String smallBinary = Integer.toBinaryString(a);
		char[] binaryChar = new char[officialSize];
		for(int o = 0; o < officialSize; o ++) {
			binaryChar[o] = '0';
		}
		StringBuilder binary = new StringBuilder(String.valueOf(binaryChar));
		for(int i = 0; i < smallBinary.length(); i++) {
			binary.setCharAt(binary.length() - 1 - i, smallBinary.charAt(smallBinary.length() - 1 - i));
			}
		String binary1 = binary.toString();
		return binary1;
		
	}
	public static String printingLetteral2(MinTerm primeImplicants2, int officialSize, int chosen) {
		String ans = "";
		String binary = getCorrectBinary(primeImplicants2.value, officialSize);
		for(int i = 0; i < primeImplicants2.diffList.size(); i++) {
			String s = getCorrectBinary((int) primeImplicants2.diffList.get(i), officialSize);
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '1') {
					binary = binary.substring(0,j)+'X'+binary.substring(j+1);
				}
			}
		}
		for(int m = 0; m < binary.length(); m++) {
			if(chosen == 1) {
			if(binary.charAt(m) == '0') {
				char letter = (char) (65 + m);
				ans = ans + letter + "'";
			}
			else if(binary.charAt(m) == '1') {
				char letter = (char) (65 + m);
				ans = ans + letter;
			}
			}
			else {
				if(binary.charAt(m) == '0') {
					char letter = (char) (65 + 22 + m);
					ans = ans + letter + "'";
				}
				else if(binary.charAt(m) == '1') {
					char letter = (char) (65 + 22 + m);
					ans = ans + letter;
				}
			}
		}
		return ans;
	}
	public static String printingLetteral(MinTerm[] primeImplicants2, int officialSize, int chosen) {
		String ans = "";
		for(int k = 0; k < primeImplicants2.length; k++) {
			if(primeImplicants2[k] == null) {
				break;
			}
		String binary = getCorrectBinary(primeImplicants2[k].value, officialSize);
		for(int i = 0; i < primeImplicants2[k].diffList.size(); i++) {
			String s = getCorrectBinary((int) primeImplicants2[k].diffList.get(i), officialSize);
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '1') {
					binary = binary.substring(0,j)+'X'+binary.substring(j+1);
				}
			}
		}
		for(int m = 0; m < binary.length(); m++) {
			if(chosen == 1) {
			if(binary.charAt(m) == '0') {
				char letter = (char) (65 + m);
				ans = ans + letter + "'";
			}
			else if(binary.charAt(m) == '1') {
				char letter = (char) (65 + m);
				ans = ans + letter;
			}
			}
			else {
				if(binary.charAt(m) == '0') {
					char letter = (char) (65 + 22 + m);
					ans = ans + letter + "'";
				}
				else if(binary.charAt(m) == '1') {
					char letter = (char) (65 + 22 + m);
					ans = ans + letter;
				}
			}
		}
		ans = ans + " + ";
	}
		ans = ans.substring(0, ans.length() - 2);
		return ans;
	}

	MinTerm[] primeImplicants;
	 MinTerm[] minterms;
	 int n = primeImplicants.length + 1;
	int m = minterms.length + 1;
	static MinTerm[][] map;
	int chosen, officialSize;

	public EssentialsCalc(MinTerm[] primeImplicants, MinTerm[] minterms, int chosen, int officialSize) {
		this.primeImplicants = primeImplicants;
		this.chosen = chosen;
		this.officialSize = officialSize;
		this.minterms = minterms;
		int n = primeImplicants.length + 1;
		int m = minterms.length + 1;
		this.map = new MinTerm[n][m];
		for (int i = 0; i < primeImplicants.length + 1; i++) {
			for (int j = 0; j < minterms.length + 1; j++) {
				MinTerm a = new MinTerm(9999, true, null);
				map[i][j] = a;
			}
		}
		for (int i = 1; i < primeImplicants.length + 1; i++) {
			map[i][0] = primeImplicants[i];
		}
		for (int i = 1; i < minterms.length + 1; i++) {
			map[0][i] = minterms[i];
		}
	}

}
