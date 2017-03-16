package oop.inherit.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class NewlecFrame extends Frame {

	
	private Panel panel;
	
	private Panel chartPanel;
	
	public NewlecFrame() {
		// TODO Auto-generated constructor stub
		
		setLayout(new BorderLayout());
		
		panel = new NewlecPanel();
		
		panel.setBackground(Color.GREEN);
		
		add(panel,BorderLayout.PAGE_START);
		
		chartPanel = new ChartPanel();
		
		chartPanel.setBackground(Color.yellow);
		
		add(chartPanel,BorderLayout.CENTER);
		
	}
}
