package Week3HomeAssignment.day1;

import java.awt.TextField;

import Week2Assignments.RadioButton;

public class Elements extends Button{

	public static void main(String[] args) {
		WebElement e = new WebElement();
		Button b = new Button();
		TextField f = new TextField();
		CheckBoxButton c = new CheckBoxButton();
		RadioButton R = new RadioButton();
		e.click();
		e.setTest("Hello World");
		b.setTest("Hello");
		b.Submit();
		f.getText();
		c.clickCheckButton();
		R.selectRadioButton();
		
		
	}

	}


