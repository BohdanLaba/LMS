package com.ex.machina.hw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ex.machina.hw.entity.Person;
import com.ex.machina.hw.service.LMSService;

@Controller
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private LMSService lmsService;

	/**
	 * show lecture participants, add people to lecture, remove from
	 * 
	 */
	public Boolean addPerson(Person person) {
		return null;
	}

	public Person updatePerson(Person person) {
		return null;
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	@ResponseBody
	public Person getPerson(@RequestParam(required = false) String id, @RequestParam(required = false) String email) {
		if (id != null) {
			return lmsService.findById(Long.valueOf(id));
		}
		return null;
	}

	public Boolean removePerson(String email) {
		return null;
	}

	@RequestMapping("showSomething")
	public ModelAndView showSmth(ModelAndView modelAndView) {
		return null;
	}
}
