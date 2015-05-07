package com.helloworld;

import java.awt.*;
import javax.swing.*;

public class HelloWorld
{
	public static void main(String[] args)
	{
		// create the frame
		HelloApp app = new HelloApp();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setPreferredSize(new Dimension(500,300));
		app.pack();
		app.setLocationRelativeTo(null);
		app.setVisible(true);
		
	}
	
}