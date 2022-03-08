package com.BloodBowl.BloodBowl.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_pseudo")
	private String userPseudo;

	@Column(name = "user_password")
	private String userPassword;

	@Column(name = "user_role")
	@Enumerated(EnumType.STRING)
	private UserRole userRole;

	public User(String userName, String userPseudo, String userPassword, UserRole userRole) {
		this.userName = userName;
		this.userPseudo = userPseudo;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}

	public User() {

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getUserPseudo() {
		return userPseudo;
	}

	public void setUserPseudo(String userPseudo) {
		this.userPseudo = userPseudo;
	}

}
