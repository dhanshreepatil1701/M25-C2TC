package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Example on List interface using array list
public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		
		//Enhanced for loop to extract the element of your ArrayList
		list.add("java");
		list.add("python");
		list.add("c++");
		/*for(String itr:list) {
			System.out.println(itr);
		}
		*/
		
		//Iterator we can extract the element of your ArrayList
		Iterator itr1=list.iterator();
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("The elements of list1 are :" +list);
		System.out.println("The elements of list2 are :" +list);
		//contain 
		
	}

}
