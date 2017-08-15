package in.test.programs.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	/** Java Non-generic Vs Generic Collection
        Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.**/
	
	
	/**Non-Genric **/
static	ArrayList arrayList= new ArrayList();
	
	/**Genric ArrayList **/
static	ArrayList<String> arrayListGenric= new ArrayList<String>();
		
	
	/**Two ways to iterate the ArrayList in Java
	 * 1. Iterable
	 * 2. Loop
	  **/
	
	public static void arrayListIterable() {

		arrayListGenric = new ArrayList<String>();
		arrayListGenric.add("Tanuj Sareen");
		arrayListGenric.add("Tanu Sareen");
		arrayListGenric.add("TS");
		
		
	 Iterator<String> iterable=arrayListGenric.iterator();
	 while (iterable.hasNext()) {
		String string = (String) iterable.next();
		System.out.println(">"+string);
	}
		
	}

	public static void arrayListLoop(){
		arrayListGenric = new ArrayList<String>();
		arrayListGenric.add("Tanuj Sareen is in Loop 1");
		arrayListGenric.add("Tanuj Sareen is in Loop 2");
		arrayListGenric.add("Tanuj Sareen is in Loop 3");
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(">"+arrayList.get(i).toString());
		}
		
	}
	
}
