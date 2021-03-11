package genericTypeExample;

import java.util.List;

public class Printer {

	// default constructor
	public Printer() {
	}
	
	// prints out all the elements of a given list
	public <E> void printElements(List<E> list) {
		for(E element : list) {
			System.out.print(element.toString() + " ");
		}
		System.out.println();
	}
	
	// checks to see if the list does not have any elements
	public <E> boolean checkEmpty(List<E> list) {
		if(list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// attempt to get the first element, but return null if the list is empty
	public <E> E getFirstElement(List<E> list) {
		boolean isEmpty = checkEmpty(list);
		if(isEmpty) {
			return null;
		} else {
			E firstElement = list.get(0);
			return firstElement;
		}
	}
	
}
