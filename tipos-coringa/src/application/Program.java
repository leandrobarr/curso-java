package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		PrintList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Leandro", "Gabriel");
		PrintList(myStrs);
	}

	private static void PrintList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}
