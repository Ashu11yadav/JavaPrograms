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
		
		
		al.add(1,"Sachin");  
		System.out.println("Element at 2nd position: "+al.get(2));  
		for(String s:al){  
		 System.out.println(s);  
		}  
	}
	
	
}
