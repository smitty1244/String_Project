package three.view;

import javax.swing.JOptionPane;

public class StringView
{
public void displayRuntimeError()
{
	int tempNumber;
	String tempString;
	
	JOptionPane.showMessageDialog(null,  " let's crash the program!!!!!!");
	tempString = JOptionPane.showInputDialog("type in your favorite number!:");
	tempNumber = Integer.parseInt(tempString);
	JOptionPane.showMessageDialog(null,  "Your favorite number is " + tempNumber);
}

// i learned who the super smash bros characters are.

public void usePassedValue(String currrentValue)
{
	JOptionPane.showMessageDialog(null, " you typed in this earlier: ");
}

public String sendParameterMethod()
{
	//When using a variable in a method you must first assign it a value.
	String temp = null;
	
	return temp;
}
public void moreInteractive(String userName, String funnyPhrase)
//the string username and string funny phrase are defined in the controller class
{
	//JOptionPane show the text in quotations in a pop up box.
	JOptionPane.showMessageDialog(null, "Hi there, wer are going to use two parameters");
	JOptionPane.showMessageDialog(null, userName + " thnks that " + "\n" + funnyPhrase + " is funny");
	// new line = \n, tab = \t
}

public void testStringMethods()
{
	// You will need to call your methods in here
	//testSubstring();
	
}

private void testSubstring()
{
	JOptionPane.showMessageDialog(null,  " Let's look at  a substring" + "\n" + "or the part of a string");
	JOptionPane.showMessageDialog(null,  " The string I am using is stored in testString");
	String testString = "supercallifragilisticexpialidocius";
	JOptionPane.showMessageDialog(null,  "It's value is: " + "\n" + testString);
	String temp = testString.substring(7);
	JOptionPane.showMessageDialog(null,  "Here it is from the 7th letter on: " + temp);
	
}

private StringView(String, string)
{
	String myString11 = "hello";
	String myString1 = "forty three";
	compareTo 	
}

public static String valueOf(Object)
{
	JOptionPane.showMessageDialog(null, "let's look at the value of an object" + "\n" + "");
	JOptionPane.showMessageDialog(null, "the object i am using is in...");
	JOptionPane.showMessageDialog(null, "")
	
}

}

}