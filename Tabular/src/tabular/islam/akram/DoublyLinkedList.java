package tabular.islam.akram;



public class DoublyLinkedList  {
	NodeDL head = new NodeDL(null);
	NodeDL tail = new NodeDL(null);
	int size;

	public DoublyLinkedList() {
		head.setNext(tail);
		head.setPrev(null);
		tail.setNext(null);
		tail.setPrev(head);
		size = 0;
	}

	public void add(int index, MinTerm element) {
		NodeDL newNode = new NodeDL(null);
		NodeDL current = head;
		newNode.setData(element);
		if (this.size() >= index && index >= 0) {
			int count = 0;
			while (count < index) {
				current = current.getNext();
				count++;
			}
			newNode.setPrev(current);
			newNode.setNext(current.getNext());
			current.getNext().setPrev(newNode);
			current.setNext(newNode);
			size++;
		} else
			throw null;
	}


	public void add(Object element) {
		NodeDL newNode = new NodeDL(null);
		NodeDL current = head;
		newNode.data=(MinTerm) element;
		while (current.getNext() != tail)
			current = current.getNext();
		current.setNext(newNode);
		newNode.setPrev(current);
		newNode.setNext(tail);
		tail.setPrev(newNode);
		size++;
	}


	public Object get(int index) {
		NodeDL current = null;
		if (this.size() > index) {
			if (index < this.size() / 2) {
				current = head;
				int count = 0;
				while (count <= index) {
					current = current.getNext();
					count++;
				}
			} else {
				current = tail;
				int count = this.size();
				while (count > index) {
					current = current.getPrev();
					count--;
				}
			}
			if (current.getData() == null || current == null)
				throw new RuntimeException();
			return current.getData();
		} else
			throw null;
	}


	public void set(int index, MinTerm element) {
		NodeDL current = null;
		if (this.size() > index && index >= 0) {
			if (index < this.size() / 2) {
				current = head;
				int count = 0;
				while (count <= index) {
					current = current.getNext();
					count++;
				}
				current.setData(element);
			} else {
				current = tail;
				int count = this.size();
				while (count > index) {
					current = current.getPrev();
					count--;
				}
				current.setData(element);
			}
		} else
			throw null;

	}

	public void clear() {
		this.head.setNext(this.tail);
		this.tail.setPrev(this.head);
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void remove(int index) {
		int count;
		if (this.size() > index && index >= 0) {
			NodeDL current;
			if (this.size() / 2 > index) {
				current = head.getNext();
				count = 0;
				while (count < index) {
					current = current.getNext();
					count++;
				}
			} else {
				current = tail.getPrev();
				count = this.size() - 1;
				while (count > index) {
					count--;
					current = current.getPrev();
				}
			}
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			current = null;
			size--;
		} else
			throw null;
	}

	public int size() {
		return this.size;
	}

	/*public DoublyLinkedList sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		DoublyLinkedList sub = new DoublyLinkedList();
		if (this.size() > fromIndex && this.size() > toIndex && toIndex >= 0 && fromIndex >= 0
				&& toIndex >= fromIndex) {
			NodeDL current = head.getNext();
			int count = 0;
			while (count < fromIndex) {
				current = current.getNext();
				count++;
			}
			while (count <= toIndex) {
				sub.add(current.getData());
				current = current.getNext();
				count++;
			}
			return sub;
		}
		throw null;
	}*/

	public boolean contains(Object o) {
		if (this.size() != 0) {
			NodeDL current = head.getNext();
			while (current != tail) {
				if (o.equals(current.getData()))
					return true;
				else {
					current = current.getNext();
				}
			}
		}
		return false;
	}
	public boolean checkEquality(DoublyLinkedList listToBeCompared)
	{
		if(listToBeCompared==null)
			return true;
		NodeDL node1=this.head.next;
		NodeDL node2=listToBeCompared.head.next;
		if(this.size!=listToBeCompared.size)
			return false;
		else{
			while(node1!=this.tail)
			{
				if(node1.getData()!=node2.getData())
					return false;
				else{
					node1=node1.getNext();
					node2=node2.getNext();
				}
			}
		}
		return true;
	}
}
