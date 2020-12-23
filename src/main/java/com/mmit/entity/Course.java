package com.mmit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
@Entity
public class Course implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy =IDENTITY )
		private int id;
		
		@Column(nullable = false)
		private String coursename;
		
		private int price;
		private Level level;
		private int duration;
		private Date startDate;
		
		public enum Level{Basic,Intermediate,Advance};
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCoursename() {
			return coursename;
		}

		public void setCoursename(String coursename) {
			this.coursename = coursename;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Level getLevel() {
			return level;
		}

		public void setLevel(Level level) {
			this.level = level;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

}
