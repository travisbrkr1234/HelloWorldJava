package com.helloworld;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class HelloApp extends JFrame implements ActionListener
{
	JPanel pnlContainer;
	public HelloApp()
	{
		// create a container for the panels
		pnlContainer = new JPanel( new BorderLayout() );
		
		// add panel container to the frame
		this.add(pnlContainer);
		JLabel lblPlaceHolder = new JLabel("Hello World!");
		lblPlaceHolder.setHorizontalAlignment(JLabel.CENTER);
		pnlContainer.add( lblPlaceHolder );
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(
				this, "Error: Invalid action");
		
	}
}
