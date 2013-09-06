package com.sbira.mwl.style;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import com.sbira.mwl.items.Item;
import com.sbira.mwl.ui.DownloadButton;

public class ThumbnailStyle extends JPanel implements StyleInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7677386960283529187L;
	private String title;
	private Image poster;
	private String episodes;
	private JButton download;
	private String titleText;
	private final Dimension poster_size = new Dimension(214, 317);

	public ThumbnailStyle(Item item) {
		//setLayout(new GridBagLayout());
		setLayout(new BorderLayout());
		setBorder(new EtchedBorder());
		Dimension size = new Dimension(150, 150);
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		
		poster = item.getPoster();
		title = item.getTitle();
		episodes = item.getEpisodes();
		
		// Title
		if(episodes != null) titleText = title + " - " + episodes;
		else titleText = title;
		add(new JLabel(titleText), BorderLayout.NORTH);
		
		// Poster
		JLabel jl = new JLabel();
		if(item.getPoster() != null) jl.setIcon(new ImageIcon(poster));
		add(jl);
		
		// Download Button
		if(item.getDownloadLink() != null) {
			download = new DownloadButton(item);
			add(download, BorderLayout.SOUTH);
		}
	}
}
