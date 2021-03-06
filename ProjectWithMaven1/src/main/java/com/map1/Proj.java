package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Proj {
	
	@Id
	private int pid;
	@Column(name="Proj_name")
	private String pname;
	
	@ManyToMany(mappedBy="projects")
	private List<Emp> emps;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
	public Proj(int pid, String pname, List<Emp> emps) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emps = emps;
	}
	public Proj() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
