package queueprio;

import java.util.Iterator;

public class PriorityQueue {

	public static void main(String[] args) {
		java.util.PriorityQueue<String> q = new java.util.PriorityQueue<String>();
		q.add("java");
		q.add(" ");
		System.out.println("head element method"+ q.element());
		
		Iterator<String> i = q.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		// TODO Auto-generated method stub
       
		//peek method
		
		java.util.PriorityQueue<String> q1 = new java.util.PriorityQueue<String>();
		q1.add("java");
		q1.add(" ");
		System.out.println("head"+ q1.peek());
		
		Iterator<String> i1 = q1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//poll method
		
		java.util.PriorityQueue<String> q2 = new java.util.PriorityQueue<String>();
		//q2.add("java");
	
	   // q2.add(" ");
		
		
		Iterator<String> i2 = q2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		q2.poll();
		System.out.println("After removing");
		Iterator<String> i3 = q2.iterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		
		//Remove method
		
		java.util.PriorityQueue<String> q3 = new java.util.PriorityQueue<String>();
		//q3.add("java");
	
		//q3.add(" ");
	
		
		Iterator<String> i4 = q3.iterator();
		while(i4.hasNext())
		{
			System.out.println(i4.next());
		}
		
		q3.remove();
		System.out.println("After removing");
		Iterator<String> i5 = q3.iterator();
		while(i5.hasNext())
		{
			System.out.println(i5.next());
		}
	}

}
