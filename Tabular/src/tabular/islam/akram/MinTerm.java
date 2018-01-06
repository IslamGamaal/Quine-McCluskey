package tabular.islam.akram;

import java.util.LinkedList;

public class MinTerm {
	int value;
	boolean checked;
	boolean dontCareCheck;
	boolean EssentialCheck = false;
	LinkedList<Object> diffList=new LinkedList<Object>() ;
	
	public MinTerm(int v,boolean dontCare,LinkedList<Object> diffrent) {
		this.value=v;
		this.checked=false;
		//this.diffList=new DoublyLinkedList();
		for (int i = 0; i < diffrent.size(); i++) {
			diffList.add(diffrent.get(i));
		}
		//this.diffList=diffrent;	
		this.dontCareCheck=dontCare;
	}
	
}
