package in.test.programs.polymorphism;

public class Polymorphism {

	/** 103) Can you achieve Runtime Polymorphism by data members?
	 * 
	 * No, because method overriding is used to achieve runtime polymorphism and
	 * data members cannot be overridden. We can override the member functions 
	 * but not the data members. Consider the example given below.
	 * 
	 ***/
	
	/** -----------Start ---------------- **/
	class Bike {
		
		int speedlimit = 90;
	}

	class Honda3 extends Bike{ 
		
		 int speedlimit=150;  
		 
	}
		 
    public  void callQuest103(){
    	
    	 Bike obj=new Honda3();  
		  System.out.println(obj.speedlimit);//90  
	
    }
    /**--------------End-------------**/
    
    
    

}
