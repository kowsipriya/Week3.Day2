package Week3.day2;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class MissingElementsInArray {

		public static void main(String[] args) {

			Integer[] arr = { 1, 2, 4, 6,7, 8 };
			Arrays.sort(arr);

			// Missing elements Using List

			List<Integer> asList = new ArrayList<Integer>(Arrays.asList(arr));
			List<Integer> list = new ArrayList<Integer>();

			for (int i = 1; i < arr.length; i++)
				list.add(i);

			list.removeAll(asList);
			System.out.println("Missing elements using List : " + list);

		}

	}

