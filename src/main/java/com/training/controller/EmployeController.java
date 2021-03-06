package com.training.controller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.persistance.model.Employe;
import com.training.service.IEmployeService;

@Controller
public class EmployeController {

	@Autowired
	IEmployeService employeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmploye(ModelAndView model) throws IOException {
		List<Employe> listEmploye = employeService.findAll();
		model.addObject("listEmploye", listEmploye);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(ModelAndView model) {
		Employe emp = new Employe();
		model.addObject("emp", emp);
		model.setViewName("EmployeForm");

		return model;

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Employe emp) {
		employeService.add(emp);

		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(HttpServletRequest req) {
		int employeeId = Integer.parseInt(req.getParameter("id"));
		Employe emp = employeService.findById(employeeId);
		employeService.delete(emp);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(HttpServletRequest req) {
		int employeeId = Integer.parseInt(req.getParameter("id"));
		Employe emp = employeService.findById(employeeId);
		ModelAndView model = new ModelAndView("EmployeForm");
		model.addObject("emp", emp);
		return model;
	}
}
