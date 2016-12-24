import java.util.ArrayList;
import java.util.Collections;

public class Scramble {

	public static void main(String[] args) {
		String word = "Hello";
		char[] scrambled = word.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for (char c : scrambled) {
			list.add(c);
		}
		Collections.shuffle(list);
		for (char c : list) {
			String a = String.valueOf(c).toLowerCase();
			System.out.print(a + " ");
		}
	}
}
