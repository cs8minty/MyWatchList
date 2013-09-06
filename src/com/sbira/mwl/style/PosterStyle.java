package com.sbira.mwl.style;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sbira.mwl.items.Item;

public class PosterStyle extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6462345137373665590L;

	public PosterStyle(Item item) {
		setSize(new Dimension(214, 317));
		if(item.getPoster() != null) add(new JLabel(new ImageIcon(item.getPoster())));
	}
}
