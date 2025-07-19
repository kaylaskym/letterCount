package project0;
// Kayla Motiram 
// lab section CSCI 212 121C
import javax.swing.JOptionPane; 

public class Project0 {
	public static void main (String[] args) {
		String input; 
		//while loop to repeat process of input 
		while (true) { 
			//store user input in string "input" variable
			input = JOptionPane.showInputDialog(null, "Please enter a sentence: "); 
			// end while loop is user entered "stop" with case protection 
			if (input.equalsIgnoreCase("Stop")) System.exit(0);
			// counters to keep track of how many lower and upper case e's 
			int lowerEcount = 0; 
			int upperEcount = 0; 
			// for loop to go through the entire input, while keeping track of upper/lower e count
			for (int i=0; i < input.length(); i++) { 
				if (input.charAt(i) == 'e') lowerEcount++;
				if (input.charAt(i) == 'E') upperEcount++;
			}
			
			// output that shows user final count of upper/lower case e's 
			JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowerEcount + "\nNumber of upper case e's: " + upperEcount);
	
			}
	}
}
	
