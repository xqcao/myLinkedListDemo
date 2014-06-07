package mylinkedlistdemo;

class mylinkedlist {
	Node nownd;
	Node head = null;
	Node end = null;

	public void ADD(Object b) {
		Node newnode = new Node(null, b);
		if (nownd != null) {
			nownd.next = newnode;
			nownd = newnode;
		} else {
			head = newnode;
			nownd = head;
		}

	}

	public void INSERT(int x, Object a) {
		Node newnode = new Node(null, a);
		int i = 0;
		nownd = head;
		if (x == 0) {
			newnode.next = head;
			head = newnode;
			nownd = newnode.next;
		} else {
			while (i < x-1) {
				i++;
				nownd = nownd.next;
			}
			newnode.next =nownd.next;
			nownd.next = newnode;
		}
	}

	public void DELETE(int y) {
		nownd = head;
		int i = 0;
		if (y == 0) {
			head = nownd.next;
		} else {
			while (i < y-1) {
				i++;
				nownd = nownd.next;
			}
			nownd.next = nownd.next.next;

		}
	}

	public int SIZE() {
		int x = 0;
		nownd = head;
		while (nownd.next != null) {
			nownd = nownd.next;
			x++;
		}
		return x;
	}

	public Object GetIndexOf(int y) {
		int i = 0;
		nownd = head;
		while (i < y) {
			i++;
			nownd = nownd.next;
		}

		return nownd.element;
	}

	public int FindNodeNum(Object e) {
		int i = 0;
		nownd = head;
		while (nownd.element != e) {
			i++;
			nownd = nownd.next;
		}

		return i;
	}

	public void REVERSE() {
		Node nownd, nextNode,temp;
		nownd = head;
		nextNode = head.next;
		head.next = null;
		while (nextNode != null){
			temp = nextNode.next;
			nextNode.next = nownd;
			nownd = nextNode;
			nextNode = temp;
			
		}
		head = nownd;
		
		
	}

}
