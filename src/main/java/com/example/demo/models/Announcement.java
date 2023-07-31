package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table
public class Announcement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@NotNull
	@Valid
	private String announcementDate;
	private String description;
	private String impactedServices;
	private String type;
	private String environment;
	private String startDate;
	private String endDate;
	
	
	
	public Announcement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Announcement(String announcementDate, String description, String impactedServices, String type,
			String environment, String startDate, String endDate) {
		super();
		this.announcementDate = announcementDate;
		this.description = description;
		this.impactedServices = impactedServices;
		this.type = type;
		this.environment = environment;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImpactedServices() {
		return impactedServices;
	}

	public void setImpactedServices(String impactedServices) {
		this.impactedServices = impactedServices;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	

	public String getAnnouncementDate() {
		return announcementDate;
	}


	public void setAnnouncementDate(String announcementDate) {
		this.announcementDate = announcementDate;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Announcement [announcementDate=" + announcementDate + ", description=" + description
				+ ", impactedServices=" + impactedServices + ", type=" + type + ", environment=" + environment
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}	
	
	
}
