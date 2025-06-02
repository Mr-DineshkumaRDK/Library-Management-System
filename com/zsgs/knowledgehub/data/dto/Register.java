package com.zsgs.knowledgehub.data.dto;

public class Register {
	   private Integer librarianId;
	    private String firstName;
	    private String lastName;
	    private String mobileNo;  // Could be Long or String; using String for flexibility
	    private String emailId;

	public Integer getLibrarianId() {
		return librarianId;
	}

	public void setLibrarianId(Integer librarianId) {
		this.librarianId = librarianId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	private String password;
	    private String confirmPassword;
	    private String userName;
	    private String dob; 
}
