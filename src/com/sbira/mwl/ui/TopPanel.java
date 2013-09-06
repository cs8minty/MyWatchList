package com.sbira.mwl.ui;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TopPanel extends JPanel {

	/**
	 * Top Panel on MainFrame
	 * Component: Display Style Icons, Search Box
	 */
	private static final long serialVersionUID = 8450644813066212707L;
	private JTextField searchField;
	
	public TopPanel() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		searchField = new JTextField(10);
		add(searchField);
	}
}
