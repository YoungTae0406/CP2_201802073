package List;

public class LLmain {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		
		numbers.addLast(30);
		numbers.addLast(20);
		numbers.addLast(10);

		LinkedList.ListIterator li = numbers.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
