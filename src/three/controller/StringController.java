package three.controller;

import three.view.StringView;

/**
 * StringController for the third Java project
 * @author jsmi6845
 *
 */
public class StringController
{
	private StringView myView;
	
	/**
	 * Creates a StringController object, initializing all values as needed.
	 */
	public StringController()
	{
		myView = new StringView();
	}
	/**
	 * Starts the code starting with displayRuntimeError method.
	 */
	public void start()
	{
//		myView.displayRuntimeError();
//		String temp = myView.sendParameterMethod();
//		myView.usePassedValue(temp);
//		
//		myView.moreInteractive("jacob", temp);		
//	//this method defines the username and funny phrase variables as "jacob" and temp
		myView.testStringMethods();
	}
	
	
}
