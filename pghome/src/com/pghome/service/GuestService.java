package com.pghome.service;

import java.util.ArrayList;
import java.util.List;

import com.pghome.dao.GuestConverter;
import com.pghome.dao.GuestDao;
import com.pghome.entity.Guest;
import com.pghome.model.GuestTO;

public class GuestService {

	private GuestDao guestDao;

	public GuestDao getGuestDao() {
		return guestDao;
	}

	public void setGuestDao(GuestDao guestDao) {
		this.guestDao = guestDao;
	}


	public void saveGuest(GuestTO guestTo) {
			System.out.println("guest save method is calling from guestService....");
			Guest guest = GuestConverter.convertToGuest(guestTo);
			guestDao.saveGuest(guest);
	}

	public List<GuestTO> display() {
		List<Guest> list = guestDao.getAllGuests();
		
		List<GuestTO> guestToList = new ArrayList<>();
		for (Guest guest : list) {
			GuestTO  guestTo = GuestConverter.convertToGuestTo(guest);
			guestToList.add(guestTo);
		}
		
		return guestToList;
	}

}
