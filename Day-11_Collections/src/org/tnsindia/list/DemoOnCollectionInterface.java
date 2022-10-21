package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

//Demo on CollectionInterface
public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		
		//use the generic method for taking only one data type(Wrapper class)
		//Collection<Integer> obj =new ArrayList<>();
		Collection obj=new ArrayList<>();
		//adding the value
		obj.add("12fgh");
		obj.add(45);
		obj.add(565.4f);
		System.out.println("The elements in collection is:" +obj);

	}

}
