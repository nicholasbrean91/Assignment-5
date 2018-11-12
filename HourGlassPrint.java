import java.util.Scanner;

public class HourGlassPrint {

	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		int hourglassInt;
		System.out.println("Type a number greater than 0 to be the size of the Hourglass.");
		hourglassInt = userInput.nextInt();
		
		if (hourglassInt < 1) {
			System.out.println("Please enter a value greater than 0");
			System.exit(0);
		}
		glass(hourglassInt);
	}
	
	public static int glass(int num) {

	return 1;

	}
}
