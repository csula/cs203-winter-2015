package exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Table {
	   static Map<String,String> table = new HashMap<String,String>();
	  
	   public static ArrayList<String> filter(String filterString) {
		   ArrayList<String> subList = new ArrayList<String>();
		   
		   for (String key : table.keySet() ) {
			   String value = table.get(key);
			   if (value.equals(filterString)) {
				   subList.add(key);
			   }
		   }
		   return subList;
	   }
	   
	   public static void printGoodGuys() {
		   /* print the names of the good guys only */
		   System.out.println("good guys:");
		   for (String name : filter("good guy")) {
			   System.out.println(" " + name);
		   }
	   }

	   public static void printBadGuys() {
		   /* print the names of the bad guys only */
		   System.out.println("bad guys:");
		   for (String name : filter("bad guy")) {
			   System.out.println(" " + name);
		   }
	   }		   

	   public static void main(String[] args) {
	      table.put("darth maul", "bad guy");
	      table.put("luke", "good guy");
	      table.put("leia", "good guy");
	      table.put("darth vader", "bad guy");
	      table.put("jaba the hut", "bad guy");
	      table.put("obi one", "good guy");
	      
	      printGoodGuys();
	      printBadGuys();
	   }
	}