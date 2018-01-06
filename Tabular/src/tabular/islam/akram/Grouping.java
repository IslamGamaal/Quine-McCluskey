package tabular.islam.akram;

import java.util.LinkedList;

public class Grouping {
	static MinTerm[] primeImplicants;
	int diffArraysCounter;
	static int primeImplicantsCounter;

	public Grouping(MinTerm[] minTerms) {
		this.primeImplicants = new MinTerm[minTerms.length];
		this.diffArraysCounter = 0;
		this.primeImplicantsCounter = 0;
	}

	public static int numOfOnes(int x) {
		int count = 0;
		String binary = Integer.toBinaryString(x);
		for (int i = 0; i < binary.length(); i++)
			if (binary.charAt(i) == '1')
				count++;
		return count;
	}

	public static int arrayIndex
	
	
	(MinTerm[] a) {
		int term = a[a.length - 1].value;
		if (term >= 0 && term <= 1)
			return 1;
		else if (term < 4)
			return 2 ;
		else if (term < 16)
			return 4 ;
		else if (term < 32)
			return 5 ;
		else if (term < 64)
			return 6;
		else if (term < 128)
			return 7;
		else if (term < 256)
			return 8;
		else if (term < 512)
			return 9;
		else if (term < 1024)
			return 10;
		else
			return 0;
	}
	static LinkedList<DoublyLinkedList[]> GroupingSteps = new LinkedList<DoublyLinkedList[]>();
	public void groups(MinTerm[] terms, int groupssize) {
		if (terms[0] == null)// base case
			return;
		MinTerm[] callArray = new MinTerm[terms.length * 5];
		int countCallArray = 0;
		DoublyLinkedList[] groupsArray = new DoublyLinkedList[groupssize + 1];
		for (int i = 0; i < terms.length; i++) {
			if (terms[i] == null)
				break;
			int index = numOfOnes(terms[i].value);
			if (groupsArray[index] == null)
				groupsArray[index] = new DoublyLinkedList();
			groupsArray[index].add(terms[i]);
		}

		for (int i = 0; i < groupsArray.length - 1; i++) {
			if (groupsArray[i] == null)
				continue;
			if (groupsArray[i + 1] == null)
				continue;
			NodeDL node1 = groupsArray[i].head.getNext();
			while (node1 != groupsArray[i].tail) {
				if (node1.getData() == null) {
					node1 = groupsArray[i].tail;
					continue;
				}
				if (groupsArray[i + 1] == null)
					continue;
				NodeDL node2 = groupsArray[i + 1].head.getNext();
				MinTerm a = node1.data;
				while (node2 != groupsArray[i + 1].tail) {
					MinTerm b = node2.data;
					int diff = b.value - a.value;
					if (((diff & -diff) == diff) && a.diffList.equals(b.diffList)) {
						node1.data.checked = true;
						node2.data.checked = true;
						MinTerm temp = new MinTerm(node1.data.value, node1.data.dontCareCheck, node1.data.diffList);
						if (temp.diffList.size() == 0)
							temp.diffList.add(diff);
						else {
							int addIndex = temp.diffList.size();
							while (addIndex != 0 && diff < (int) temp.diffList.get(addIndex - 1))
								addIndex--;
							if (addIndex == temp.diffList.size())
								temp.diffList.add(diff);
							else
								temp.diffList.add(addIndex, diff);

						}
						callArray[countCallArray] = temp;
						countCallArray++;
					}
					node2 = node2.getNext();
				}
				node1 = node1.getNext();
			}
		}
		for (int i = 0; i < groupsArray.length; i++) {
			if (groupsArray[i] == null)
				continue;
			NodeDL node = groupsArray[i].head.getNext();
			while (node != groupsArray[i].tail) {
				if (!node.data.checked) {
					boolean check = true;
					for (int j = 0; j < primeImplicantsCounter; j++) {
						if (primeImplicants[j].value == node.data.value
								&& primeImplicants[j].diffList.equals(node.data.diffList)) {
							check = false;
							break;
						}
					}
					if (check == false) {
					} else {
						primeImplicants[primeImplicantsCounter] = node.data;
						primeImplicantsCounter++;
					}
				}
				node = node.next;
			}
		}
		GroupingSteps.add(groupsArray);
		diffArraysCounter++;
		groups(callArray, groupssize - 1);

	}
}
