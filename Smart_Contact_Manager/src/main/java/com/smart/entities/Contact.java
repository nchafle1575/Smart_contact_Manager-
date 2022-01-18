package com.smart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT")
public class Contact {
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int cid;
 private String name;
 private String nickName;
 private String work;
 private String email;
 private String image;
 private String phone;
 @Column(length=5000)
 private String description;
 
 @ManyToOne
 private User user;
 
public Contact(int cid, String name, String nickName, String work, String email, String image, String phone,
		String description) {
	super();
	this.cid = cid;
	this.name = name;
	this.nickName = nickName;
	this.work = work;
	this.email = email;
	this.image = image;
	this.phone = phone;
	this.description = description;
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}
public String getWork() {
	return work;
}
public void setWork(String work) {
	this.work = work;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
 
 
 
}
