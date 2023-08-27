package FirstProg;

import java.util.ArrayList;
import java.util.List;

public class ArryPgm2 {

	public static void main(String[] args) {
		
		List<String> i = new ArrayList<>();
		i.add("Automation");
		i.add("Testing");
		i.add("100");
		i.add("Manual");
		i.add("TestingEngineer");
		
		System.out.println(i.size());
		
		for(int j=0;j<i.size();j++)
		{
			System.out.println(i.get(j));
		}

	}

}
