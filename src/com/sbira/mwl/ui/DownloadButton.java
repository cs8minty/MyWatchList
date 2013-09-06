package com.sbira.mwl.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URL;

import javax.swing.JButton;

import com.sbira.mwl.items.Item;

public class DownloadButton extends JButton implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5135737691163651279L;
	private URL url;
	
	public DownloadButton(Item item) {
		this(item, "Download");
	}
	
	public DownloadButton(Item item, String title) {
		super(title);
		this.url = item.getDownloadLink();
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == this) {
			try {
				openLink(this.url.toURI());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	public static void openLink(URI uri) {
	    try {
	      Object o = Class.forName("java.awt.Desktop").getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
	      o.getClass().getMethod("browse", new Class[] { URI.class }).invoke(o, new Object[] { uri });
	    } catch (Throwable e) {
	      System.out.println("Failed to open link " + uri.toString());
	    }
	  }

}
