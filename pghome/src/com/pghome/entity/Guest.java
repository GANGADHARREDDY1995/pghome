package com.pghome.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import oracle.sql.BLOB;

@Entity
@Table(name = "GUEST")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GENID")
	private Long genId;

	@Column(name = "ADMISSION_NUMBER", nullable=false) // SRM1001
	private String admissionNumber;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "SURNAME")
	private String surName;

	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private Date dateOfBirth;

	@Column(name = "DATE_OF_JOINING", nullable = false)
	private Date dateOfJoining;

	@Column(name = "MOBILE", nullable = false)
	private String mobile;

	@Column(name = "AGE", nullable = false)
	private short age;

	@Column(name = "EMPLOYMENT_TYPE", nullable = false)
	private String employmentType;

	@Column(name = "ORGANIZATION")
	private String organization;

	@Column(name = "GENDER", nullable = false)
	private String gender;

	@Column(name = "EMERGENCY_CONTACT", nullable = false)
	private String emergencyContact;

	@Column(name = "ADVANCE_AMOUNT", nullable = false)
	private double advanceAmount;

	@Column(name = "MONTHLY_RENT", nullable = false)
	private double monthlyRent;

	@Column(name = "DOCUMENT_TYPE", nullable = false)
	private String identityDocumentType;

	@Column(name = "IDENTITY_NUMBER", nullable = false)
	private String identityNumber;

	@Column(name = "photo")
	private BLOB photo;

	@Column(name = "ADDRESS")
	private String address;

	public Long getGenId() {
		return genId;
	}

	public void setGenId(Long genId) {
		this.genId = genId;
	}

	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public double getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public double getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	public String getIdentityDocumentType() {
		return identityDocumentType;
	}

	public void setIdentityDocumentType(String identityDocumentType) {
		this.identityDocumentType = identityDocumentType;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public BLOB getPhoto() {
		return photo;
	}

	public void setPhoto(BLOB photo) {
		this.photo = photo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	}
