package com.pr.pr01;

public class UserVo {
	//필드
	private String empid;
	private String name;
	private String daprtment_name;
	private String id;
	private String pw;
	private String email;
	private String address;
	private String phonenumber;
	private String hire_date;
	
	//생성자
	public UserVo() {
		super();
	}

	public UserVo(String empid, String name, String daprtment_name, String id, String pw, String email, String address, String phonenumber,
			String hire_date) {
		this.empid = empid;
		this.name = name;
		this.daprtment_name = daprtment_name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.address = address;
		this.phonenumber = phonenumber;
		this.hire_date = hire_date;
		
	}
	
	
	//메소드 gs
	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDaprtment_name() {
		return daprtment_name;
	}

	public void setDaprtment_name(String daprtment_name) {
		this.daprtment_name = daprtment_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "UserVo [empid=" + empid + ", name=" + name + ", daprtment_name=" + daprtment_name + ", id=" + id
				+ ", pw=" + pw + ", email=" + email + ", address=" + address + ", phonenumber=" + phonenumber
				+ ", hire_date=" + hire_date + "]";
	}
	
	public void saveEmp(String empid, String name, String daprtment_name, String id, String pw, String email, String address, String phonenumber,
			String hire_date) {
		
	}

	

}
