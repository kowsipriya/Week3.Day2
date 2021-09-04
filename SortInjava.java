package Week3.day2;

	import java.util.*;

	public class SortInjava {
		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			
			list.add("Aspire systems");
			list.add("CTS");
			list.add("Wipro");
			list.add("HCL");
			
			System.out.println("Given Strings stored in a list : " + list);
			
			Collections.sort(list);
			
			System.out.print("Printing sorted List in Reverse Order : ");
			for(int i=list.size()-1;i>=0;i--)
				System.out.print(list.get(i) + " , ");

			System.out.println("");
			System.out.println("Printing sorted List : "+list);
		}

	}

