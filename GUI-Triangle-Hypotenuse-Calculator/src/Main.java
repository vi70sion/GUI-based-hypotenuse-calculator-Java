import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double x, y, z;
		Scanner scanner = new Scanner(System.in);
		
		try {
			x = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter triangle side x", "Triangle hypotenuse", JOptionPane.QUESTION_MESSAGE));
			y = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter triangle side y", "Triangle hypotenuse", JOptionPane.QUESTION_MESSAGE));
			z = Math.sqrt((x*x)+(y*y));
			JOptionPane.showMessageDialog(null, "Triangle hypotenuse is "+z, "Triangle hypotenuse", JOptionPane.PLAIN_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Incorrect input", "Triangle hypotenuse", JOptionPane.ERROR_MESSAGE);
		} 
		scanner.close();

	}

}
