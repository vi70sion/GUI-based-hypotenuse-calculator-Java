import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double x, y, z;
		Scanner scanner = new Scanner(System.in);
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Enter triangle side x"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Enter triangle side y"));
		
		z = Math.sqrt((x*x)+(y*y));
		
		JOptionPane.showMessageDialog(null, "Triangle hypotenuse is "+z);
		scanner.close();

	}

}