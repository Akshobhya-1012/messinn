package com.app.dto;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;


public class LoginAndSignUpSuccessDto {
	
	private Long id;
	private String Name;
	//private String lastName;
	private String email;
	private String mob;
	private String userName;
    private String role;
	public LoginAndSignUpSuccessDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginAndSignUpSuccessDto(Long id, String Name,  String email, String mob,
			String userName, String role) {
		super();
		this.id = id;
		this.Name =Name;
		//this.lastName = lastName;
		this.email = email;
		this.mob = mob;
		this.userName = userName;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return Name;
	}
	public void setFirstName(String firstName) {
		this.Name = firstName;
	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mob = mob;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
    

}
