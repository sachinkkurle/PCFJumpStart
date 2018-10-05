package com.avinash.learn.security.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avinash.learn.domain.entities.Appointment;
import com.avinash.learn.domain.entities.AutoUser;
import com.avinash.learn.security.domain.repositories.AppointmentRepository;
import com.avinash.learn.security.domain.repositories.AutoUserRepository;

@Controller()
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private AutoUserRepository autoUseRepository;

	@ModelAttribute
	public Appointment getAppointment() {
		return new Appointment();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAppointmentPage() {
		return "appointments";
	}

	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public List<Appointment> saveAppointment(@ModelAttribute Appointment appointment) {
		AutoUser user =(AutoUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		appointment.setUser(user);
		appointment.setStatus("Initial");
		appointmentRepository.save(appointment);
		return this.appointmentRepository.findAll();
	}

	@ResponseBody
	@RequestMapping("/all")
	public List<Appointment> getAppointments() {
		return this.appointmentRepository.findAll();
	}

	@RequestMapping("/{appointmentId}")
	public String getAppointment(@PathVariable("appointmentId") Long appointmentId, Model model) {
		Appointment appointment = appointmentRepository.findOne(appointmentId);
		model.addAttribute("appointment", appointment);
		return "appointment";
	}

}
