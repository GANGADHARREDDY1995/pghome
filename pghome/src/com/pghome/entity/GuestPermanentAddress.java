package com.pghome.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*@Entity
@Table(name = "address")
*/
public class GuestPermanentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serialNumber")
	private long serialNumber;

	@Column(name = "doorNumber")
	private String doorNo;

	private String street;
	private String postOffice;
	private String mondal;
	private String distric;
	private long pincode;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Guest.class)
	@JoinColumn(insertable = true, nullable = false, name = "guesradmission", referencedColumnName = "admissionNumber")
	private Guest guest;

	public GuestPermanentAddress() {

	}

	@Column(name = "street")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "post")
	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	@Column(name = "mondal")
	public String getMondal() {
		return mondal;
	}

	public void setMondal(String mondal) {
		this.mondal = mondal;
	}

	@Column(name = "distric")
	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	@Column(name = "pincode")
	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

}
