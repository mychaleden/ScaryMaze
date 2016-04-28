import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main (String[]args){
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int R = new Random().nextInt(6);
	// 3. Print out this variable
System.out.println(R);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "ask a question");
	// 5. If the random number is 0
if (R == (0)){
	// -- tell the user "Yes"
JOptionPane.showInternalMessageDialog(null, "yeah man");
}
	// 6. If the random number is 1
if (R == (1)) {
	JOptionPane.showMessageDialog(null, "nah man");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (R == (2)) {
	JOptionPane.showMessageDialog(null, "idk ask google");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (R == (3)) {
	JOptionPane.showMessageDialog(null, "give up bc your questions suck");
}
	// -- write your own answer
if (R == (4)) {
	JOptionPane.showMessageDialog(null, "totally");
	}
if (R == (5)) {
	JOptionPane.showMessageDialog(null, "lol no");
	
}

if (R == (6)) {
	JOptionPane.showMessageDialog(null, "stop asking questions");
}
}
}

