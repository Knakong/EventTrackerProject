package com.skilldistillery.peaktime.entities;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	

	private LocalDateTime date;
	private String rant;
	public String getRant() {
		return rant;
	}


	public void setRant(String rant) {
		this.rant = rant;
	}

	private String imgurl;
	
	private int disabled;
	
	
	public LocalDateTime getDate() {
		return date;
	}
	
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public int getDisabled() {
		return disabled;
	}
	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", date=" + date + ", rant=" + rant + ", imgurl=" + imgurl
				+ ", disabled=" + disabled + "]";
	}
	
	

}
