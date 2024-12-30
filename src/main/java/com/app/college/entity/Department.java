package com.app.college.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department",schema = "college")
public class Department implements Serializable {
	
	private static final long serialVersionUID=-4884884;
		
	@Override
	public String toString() {
		return "Department [numid=" + numid + ", departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	
	public int getNumid() {
		return numid;
	}
	public void setNumid(int numid) {
		this.numid = numid;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="numid")
	int numid;
	private Long departmentId;
	@Column(name="department_name")
    private String departmentName;
	@Column(name="department_address")
    private String departmentAddress;
	@Column(name="department_code")
    private String departmentCode;

}
