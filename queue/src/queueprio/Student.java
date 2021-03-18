package queueprio;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	 

	  
	  String name;
	  String grade;
	  
	
	  public Student(String name, String grade) {
		super();
		
		this.name = name;
		this.grade = grade;
	}


	  
	@Override
	public int compareTo(Student e) {
		
		if(name == e.name)
		{
			return 0;
		}
		 else 
		{
			return 1;
		}
		
		
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student( "raja", "A2"));
		al.add(new Student( "ragul", "A1"));
		al.add(new Student( "ram", "A4"));
		
       
		
		//Collections.sort(al);
		for(Student e : al)
			
	    System.out.println( e.name + " " + e.grade);
	
	
	}
}

   
 
 
 
 
 
 
 
 
 
 
 
 
 