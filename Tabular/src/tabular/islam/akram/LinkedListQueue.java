package tabular.islam.akram;

import java.util.LinkedList;

public class LinkedListQueue{

	LinkedList<Object> queue = new LinkedList<Object>();


	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		queue.addFirst(item);
	}

	public Object dequeue() {
		// TODO Auto-generated method stub
		if (queue.isEmpty() == true) {
			throw new RuntimeException();
		} else {
			return queue.removeLast();
		}
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (queue.isEmpty()) {
			return true;
		}
		return false;
	}


	public int size() {
		// TODO Auto-generated method stub
		return queue.size();
	}

}
