package com.pghome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pghome.model.GuestTO;
import com.pghome.service.GuestService;

@Controller
public class HomeController {

	@Autowired
	GuestService guestService;

	@RequestMapping("/registrationForm")
	public ModelAndView getRegistrationForm() {
		ModelAndView view = new ModelAndView();
		view.setViewName("registration");
		view.addObject("guest", GuestTO.class);
		System.out.println("sending to registration form");
		return view;
	}

	@RequestMapping("/registration")
	public ModelAndView getRegistration(@ModelAttribute GuestTO guest /*, BindingResult result, Model model*/) {

		/*//model.addAttribute("Guest", guest);
		model.addAttribute("list", new GuestTO());
		//model.addAttribute(guest);
*/
		System.out.println("sending registration data");

		guestService.saveGuest(guest);
		List<GuestTO> list = guestService.display();

		return new ModelAndView("display", "guestAllList", list);
	}

	@RequestMapping("/display")
	public ModelAndView getDisplay() {
		System.out.println("calling get display method from home controller class");
		List<GuestTO> list = guestService.display();

		return new ModelAndView("display", "guestAllList", list);
	}

}
