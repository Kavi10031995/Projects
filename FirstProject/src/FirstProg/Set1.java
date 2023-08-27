package FirstProg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set  value = new HashSet<>();
		value.add("Kavi");
		value.add("bala");
		value.add(2019);
		value.add('@');
		value.add(2829);

		System.out.println("Number of items in hashset  " +value.size());
	    
		Iterator i = value.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

