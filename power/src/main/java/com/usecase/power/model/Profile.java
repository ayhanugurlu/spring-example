package com.usecase.power.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PROFILE")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "PROFILE_NAME")
	private String profileName;

	@Column(name = "YEAR")
	private Integer year;

	@Column(name = "MONTH")
	private Integer month;

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
