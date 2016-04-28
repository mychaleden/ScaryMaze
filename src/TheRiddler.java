import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		
String answer1= JOptionPane.showInputDialog("What gets broken without being held?");
	
if (answer1.equals("a promise")){
 
	JOptionPane.showMessageDialog(null, "lol correct");
}

else {
	JOptionPane.showMessageDialog(null, "wrong");
}

String answer2= JOptionPane.showInputDialog(" What two things can you never eat for breakfast?");
	
if (answer2.equals("lunch and dinner"))
{
	JOptionPane.showMessageDialog(null, "lol correct");
	}
else 
{
	JOptionPane.showMessageDialog(null, "wrong");
}

	
		
	}
}

