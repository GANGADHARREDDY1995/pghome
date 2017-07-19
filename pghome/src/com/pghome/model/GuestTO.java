package com.pghome.model;

import java.util.Date;

import oracle.sql.BLOB;

public class GuestTO {

	private String firstName;
	private String surName;
	private String admissionNumber;
	private String mobile;
	private String homeMobile;
	private Date dateOfBirth;
	private String identityCardType;
	private String idendityNumber;
	private String address;
	private short age;
	private String gender;
	private String organization;
	private Date dateOfAdminssion;
	private String employmentType;
	private BLOB photo;
	private double monthlyRent;
	private double advanceAmount;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHomeMobile() {
		return homeMobile;
	}
	public void setHomeMobile(String homeMobile) {
		this.homeMobile = homeMobile;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getIdentityCardType() {
		return identityCardType;
	}
	public void setIdentityCardType(String identityCardType) {
		this.identityCardType = identityCardType;
	}
	public String getIdendityNumber() {
		return idendityNumber;
	}
	public void setIdendityNumber(String idendityNumber) {
		this.idendityNumber = idendityNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public Date getDateOfAdminssion() {
		return dateOfAdminssion;
	}
	public void setDateOfAdminssion(Date dateOfAdminssion) {
		this.dateOfAdminssion = dateOfAdminssion;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public BLOB getPhoto() {
		return photo;
	}
	public void setPhoto(BLOB photo) {
		this.photo = photo;
	}
	public double getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	public double getAdvanceAmount() {
		return advanceAmount;
	}
	public void setAdvanceAmount(double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	

	}
