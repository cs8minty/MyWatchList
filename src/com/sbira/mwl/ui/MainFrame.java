package com.sbira.mwl.ui;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		TopPanel topPanel = new TopPanel();
		JScrollPane contentsPanel = new JScrollPane(new ContentsPanel(3, 3, 5, 5));
		contentsPanel.setSize(640, 480);
		contentsPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(contentsPanel, BorderLayout.CENTER);
	}
}
