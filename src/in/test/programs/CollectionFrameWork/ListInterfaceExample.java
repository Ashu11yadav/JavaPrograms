package in.test.programs.CollectionFrameWork;

import java.util.ArrayList;

public class ListInterfaceExample {

	/**Java List Interface
    --> List Interface is the subinterface of Collection.
It contains methods to insert and delete elements 
in index basis.It is a factory of ListIterator interface.
     --> public interface List<E> extends Collection<E>
 **/
	
	public static void listInterfaceCall() {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Tanuj1");
		al.add("Tanuj2");
		al.add("Tanuj3");
		al.add("Tanuj4");
		
	}
	
	
}
