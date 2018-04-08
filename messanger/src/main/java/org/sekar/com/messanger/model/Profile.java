package org.sekar.com.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
		
	private long id;
	private String firstName;
	private String lsatName;
	private String profileName;
	private Date created;
	
	public Profile(){
		
	}
	
	public Profile(long id, String profileName,String firstName, String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lsatName = lsatName;
		this.profileName = profileName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLsatName() {
		return lsatName;
	}

	public void setLsatName(String lsatName) {
		this.lsatName = lsatName;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}
