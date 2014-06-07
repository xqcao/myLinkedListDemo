package mylinkedlistdemo;

public class mylinkedlistdemo {

	public static void main(String[] args) {
		mylinkedlist list = new mylinkedlist();
		for(int i = 11; i < 17; i++){
			list.ADD(i);
		}
		
		list.ADD("abc");
		
		for(int i=0; i<=list.SIZE();i++) {
			System.out.print(list.GetIndexOf(i) + "   ");
		}
		System.out.println();
		System.out.println("---------------");
		list.DELETE(0);

		for(int i=0; i<=list.SIZE();i++) {
			System.out.print(list.GetIndexOf(i) + "   ");
		}
		list.REVERSE();
		
		
		//list.INSERT(1,"aaa");
		System.out.println();
		System.out.println("---------------");
		for(int i = 0; i <= list.SIZE(); i++) {
			System.out.print(list.GetIndexOf(i) + "   ");
		}
		//System.out.println(list.SIZE());
	}

}
