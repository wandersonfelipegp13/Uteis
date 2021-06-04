package indexOfChar;
import javax.swing.JOptionPane;

public class IndexOfChar {

	public static char a[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog("String: ");

		//System.out.print(s + " = ");

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < a.length; j++)
				if (s.charAt(i) == a[j])
					System.out.print(a[j] + ": " + (j + 1) + ", ");
		}

	}

}
