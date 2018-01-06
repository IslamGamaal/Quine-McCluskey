package tabular.islam.akram;

public class NodeDL {

	 MinTerm data;
	 NodeDL next;
	 NodeDL prev;

	public NodeDL(Object value) {
		this.data = (MinTerm) value;
		this.next = null;
		this.prev = null;

	}

	public NodeDL(Object value, NodeDL after, NodeDL before) {
		super();
		this.data = (MinTerm) value;
		this.next = after;
		this.prev = before;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object element) {
		this.data = (MinTerm) element;
	}
	
	

	public NodeDL getNext() {
		return next;
	}

	public void setNext(NodeDL after) {
		this.next = after;
	}

	public NodeDL getPrev() {
		return prev;
	}

	public void setPrev(NodeDL before) {
		this.prev = before;
	}

}
