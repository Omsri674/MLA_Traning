package JAVA_MLA.src.com.mla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Emp3 {
	public static void main(String[] sri) {
		ArrayList<String> listS = new ArrayList<>();
		listS.add("eswar");
		listS.add("tharun");
		listS.add("karthick");
		listS.add("deva");
		listS.add("adhav");
		listS.add("sandy");
		listS.add("shek");
		listS.add("rajan");
		
		Iterator<String> itr =  listS.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//sorting by Collections class
		Collections.sort(listS);
		System.out.println(listS);
		
//sorting reverse
		Collections.sort(listS.reversed());
		System.out.println(listS);

	}
}
