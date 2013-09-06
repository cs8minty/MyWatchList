package com.sbira.mwl.items;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Item {

	public static final String TYPE_MOVIE = "M";
	public static final String TYPE_TV_SERIES = "TVS";
	public static final String TYPE_TV_MOVIE = "TV";
	public static final String TYPE_VIDEO = "V";
	public static final String TYPE_VIDEO_GAME = "VG";

	private String title;
	private String episodes;
	private String plot;
	private String type;
	private String[] genres;
	private int year;
	private Image poster;
	private URL downloadLink;

	public Item() {
		// TODO Auto-generated constructor stub
		test();
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getEpisodes() {
		return this.episodes;
	}

	public void setEpisodes(String episodes) {
		this.episodes = episodes;
	}

	public String getPlot() {
		return this.plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		switch (type) {
		case "M":
			this.type = "Movie";
		case "TVS":
			this.type = "TV Series";
		case "TV":
			this.type = "TV Movie";
		case "V":
			this.type = "Video";
		case "VG":
			this.type = "Video Game";
		default:
			return;
		}
	}

	public String[] getGenres() {
		return this.genres;
	}

	public void setGenres(String[] genres) {
		this.genres = genres;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Image getPoster() {
		return this.poster;
	}

	public void setPoster(String url) {
		try {
			URL img_url = new URL(url);
			this.poster = ImageIO.read(img_url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public URL getDownloadLink() {
		return this.downloadLink;
	}

	public void setDownloadLink(String url) {
		try {
			this.downloadLink = new URL(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void test() {
		
		try {
			String url = "http://seungangelx.cafe24.com/torrent_jquery/torrent.php?search=%EB%AC%B4%ED%95%9C%EB%8F%84%EC%A0%84&ct=all";
			Document doc = Jsoup.connect(url).post();
			Elements items = doc.select(".wrdLatest");
			for(Element e : items) {
				Elements links = e.select("a");
				for(Element l : links) {
					System.out.println(l.attr("href"));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
