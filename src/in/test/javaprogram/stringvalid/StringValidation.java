package in.test.javaprogram.stringvalid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringValidation {

	public StringValidation() {
		// TODO Auto-generated constructor stub
	}

	/** Valid->  ()(){}
	    Valid->  {{}}()
	    Valid->  [](){}
	    Invalid-> {{]]
	    Invalid-> {[}] 
	 *  **/
	public static boolean isValid(String s) {
        
		Stack<Character> stack = new Stack<Character>(); boolean isValid= true;
		Map<Character,Character> map = new HashMap<Character, Character>();
		map.put('}','{');
		map.put(')','(');
		map.put(']', '[');
	    
	    int len= s.length();
	    
	    for(int i=0;i<len;i++){
	        
	        if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
	            stack.push(s.charAt(i));
	        }else if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'){
	            if(map.get(s.charAt(i))==stack.peek()){
	                stack.pop();
	            }else {
	                
	                return false;
	            }
	        }
	    }
	   return stack.isEmpty();
	    
	        
	    }
}
