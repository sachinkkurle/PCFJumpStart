package learn.avinash.security.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import learn.avinash.security.domain.entities.Appointment;
import learn.avinash.security.domain.entities.AutoUser;
import learn.avinash.security.domain.repositories.AppointmentRepository;
import learn.avinash.security.domain.repositories.AppointmentUtils;

@Controller()
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private AppointmentUtils util;
	
	@ModelAttribute("isUser")
	public boolean isUser(Authentication auth){
		return auth != null &&
				auth.getAuthorities().contains(AuthorityUtils.createAuthorityList("ROLE_USER").get(0));
	}
	
	@ModelAttribute
	public Appointment getAppointment() {
		return new Appointment();
	}

	@RequestMapping("/test")
	@ResponseBody
	public String testPrefilter(Authentication auth){
		AutoUser user = (AutoUser) auth.getPrincipal();
		AutoUser otherUser = new AutoUser();
		otherUser.setEmail("haxor@haxor.org");
		otherUser.setAutoUserId(100L);
		
		return util.saveAll(new ArrayList<Appointment>(){{
			add(AppointmentUtils.createAppointment(user));
			add(AppointmentUtils.createAppointment(otherUser));
		}});
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAppointmentPage() {
		return "appointments";
	}

	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public List<Appointment> saveAppointment(@ModelAttribute Appointment appointment) {
		AutoUser user = (AutoUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		appointment.setUser(user);
		appointment.setStatus("Initial");
		appointmentRepository.save(appointment);
		return this.appointmentRepository.findAll();
	}

	@ResponseBody
	@RequestMapping("/all")
	@PostFilter("principal.autoUserId == filterObject.user.autoUserId")
	public List<Appointment> getAppointments(Authentication auth) {
		return this.appointmentRepository.findAll();
	}

	@RequestMapping("/{appointmentId}")
	@PostAuthorize("hasPermission(#model['appointment'],'read')")
	public String getAppointment(@PathVariable("appointmentId") Long appointmentId, Model model) {
		Appointment appointment = appointmentRepository.findOne(appointmentId);
		model.addAttribute("appointment", appointment);
		return "appointment";
	}

	@ResponseBody
	@RequestMapping("/confirm/{appointmentId}")
	@PostAuthorize("hasPermission(returnObject,'administration')")
	public Appointment confirm(@PathVariable Long appointmentId) {
		return this.appointmentRepository.findOne(appointmentId);
	}

	@ResponseBody
	@RequestMapping("/cancel")
	public String cancel() {
		return "cancelled";
	}

	@ResponseBody
	@RequestMapping("/complete")
	@RolesAllowed("ROLE_ADMIN")
	public String complete() {
		return "completed";
	}
}
