package com.sbira.mwl.ui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.w3c.dom.Document;

import com.sbira.mwl.items.Item;
import com.sbira.mwl.style.PosterStyle;
import com.sbira.mwl.style.ThumbnailStyle;

public class ContentsPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5850925674820412393L;

	public ContentsPanel(int rows, int cols, int hgap, int vgap) {
		//setLayout(new GridLayout(rows, cols, hgap, vgap));
		setLayout(new FlowLayout());
		setSize(640, 480);
		
		Item item = new Item();
		item.setTitle("Siberia");
		item.setEpisodes("S01E09");
		item.setType(Item.TYPE_TV_SERIES);
		//item.setPoster("http://cafefiles.naver.net/20120222_115/10286641_1329849155215_YQhbeV_png/10286641_033235215.png");
		item.setDownloadLink("http://job.etorrent.co.kr/bbs/board.php?bo_table=torrent_mid&wr_id=1325108&sca=&sfl=wr_subject&stx=under");
		add(new PosterStyle(item));
		add(new ThumbnailStyle(item));
		add(new ThumbnailStyle(item));
		add(new ThumbnailStyle(item));
		add(new ThumbnailStyle(item));
		add(new ThumbnailStyle(item));
	}
	
	public ContentsPanel() {
		this(3, 3, 5, 5);
	}

}
