package com.sample.SpringAdmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@RequestMapping(value="/name" ,method=RequestMethod.GET)
	public String getName() {
		return "Sample Spring Admin Project";
	}
}
