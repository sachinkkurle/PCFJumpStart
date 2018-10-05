package learn.avinash.security.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@Controller()
@RequestMapping("/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@ModelAttribute("isUser")
	public boolean isUser(Authentication auth) {
		return auth != null && auth.getAuthorities().contains(AuthorityUtils.createAuthorityList("ROLE_USER").get(0));
	}

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
		AutoUser user = (AutoUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
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

	@ResponseBody
	@RequestMapping("/confirm")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String confirm() {
		return "confirmed";
	}

	@ResponseBody
	@RequestMapping("/cancel")
	public String cancel() {
		return "cancelled";
	}

	@ResponseBody
	@RequestMapping("/complete")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String complete() {
		return "completed";
	}

}
