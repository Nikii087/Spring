package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	private List<Proj>projects;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Proj> getProjects() {
		return projects;
	}
	public void setProjects(List<Proj> projects) {
		this.projects = projects;
	}
	
	public Emp(int eid, String name, List<Proj> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
