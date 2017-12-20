package com.dorm.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name ="complain")
public class Complain {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long complainId;
	 
	 @NotEmpty(message = "{NotEmpty.validation}")
	 private String subject;
	 
	 
	 @NotEmpty(message = "{NotEmpty.validation}")
	 @Column(name="content", columnDefinition="TEXT")
	 private String content;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 private Date complainDate;
	 
	 @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	 @JoinColumn(name = "user_id")
	 private User user;

	public long getComplainId() {
		return complainId;
	}

	public void setComplainId(long complainId) {
		this.complainId = complainId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getComplainDate() {
		return complainDate;
	}

	public void setComplainDate(Date complainDate) {
		this.complainDate = complainDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	 
	
	
	

}
