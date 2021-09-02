package CollectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPrograms {

	public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add("A");
	al.add(5);
	al.add(1);
	al.add(3);
	al.add(1);
	
	System.out.println((Integer)al.get(1)+5);

	System.out.println(al.getClass());
	
	}
	
	

}
