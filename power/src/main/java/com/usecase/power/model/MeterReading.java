package com.usecase.power.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "METER_READING")
public class MeterReading {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "CONNECTION_ID")
	private Long connectionId;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "PROFILE_ID", nullable = false)
	private Profile profile;
	
	@Column(name = "VALUE")
	private Integer value;

	public MeterReading() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MeterReading(Long id, Long connectionId, Profile profile, Integer value) {
		this.id = id;
		this.connectionId = connectionId;
		this.profile = profile;
		this.value = value;
	}

	public Long getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(Long connectionId) {
		this.connectionId = connectionId;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
