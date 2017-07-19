package com.pghome.dao;

import com.pghome.entity.Guest;
import com.pghome.model.GuestTO;

public class GuestConverter {

	public static Guest convertToGuest(GuestTO guestTo) {
		Guest guest = new Guest();

		guest.setAdmissionNumber(guestTo.getAdmissionNumber());
		guest.setFirstName(guestTo.getFirstName());
		guest.setSurName(guestTo.getSurName());
		guest.setAddress(guestTo.getAddress());
		guest.setAdvanceAmount(guestTo.getAdvanceAmount());
		guest.setGender(guestTo.getGender());
		guest.setAge(guestTo.getAge());
		guest.setDateOfBirth(guestTo.getDateOfAdminssion());
		guest.setDateOfJoining(guestTo.getDateOfAdminssion());
		guest.setEmploymentType(guestTo.getEmploymentType());
		guest.setIdentityDocumentType(guestTo.getIdentityCardType());
		guest.setIdentityNumber(guestTo.getIdendityNumber());
		guest.setMobile(guestTo.getMobile());
		guest.setEmergencyContact(guestTo.getHomeMobile());
		guest.setMonthlyRent(guestTo.getMonthlyRent());
		guest.setOrganization(guestTo.getOrganization());
		guest.setPhoto(guestTo.getPhoto());

		return guest;
	}

	public static GuestTO convertToGuestTo(Guest guest) {
		GuestTO guestTo = new GuestTO();

		guestTo.setAdmissionNumber(guest.getAdmissionNumber());
		guestTo.setAddress(guest.getAddress());
		guestTo.setAdvanceAmount(guest.getAdvanceAmount());
		guestTo.setAge(guest.getAge());
		guestTo.setDateOfAdminssion(guest.getDateOfJoining());
		guestTo.setEmploymentType(guest.getEmploymentType());
		guestTo.setFirstName(guest.getFirstName());
		guestTo.setSurName(guest.getSurName());
		guestTo.setGender(guest.getGender());
		guestTo.setHomeMobile(guest.getEmergencyContact());
		guestTo.setIdendityNumber(guest.getIdentityNumber());
		guestTo.setIdentityCardType(guest.getIdentityDocumentType());
		guestTo.setMobile(guest.getMobile());
		guestTo.setMonthlyRent(guest.getMonthlyRent());
		guestTo.setOrganization(guest.getOrganization());
		guestTo.setPhoto(guest.getPhoto());
		guestTo.setDateOfBirth(guest.getDateOfBirth());

		return guestTo;
	}
}
