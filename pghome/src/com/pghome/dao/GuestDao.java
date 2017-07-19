package com.pghome.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.pghome.entity.Guest;

public class GuestDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;

	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveGuest(Guest guest) {
		System.out.println("guest save method is calling from guestDao class...");
	//	hibernateTemplate.save(guest);
		hibernateTemplate.persist(guest);
	}

	public List<Guest> getAllGuests() {
		System.out.println("callineg display method from guestDao class");
		List<Guest> list = hibernateTemplate.loadAll(Guest.class);

		return list;
	}

}
