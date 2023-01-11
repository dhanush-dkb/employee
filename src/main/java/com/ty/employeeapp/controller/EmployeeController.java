package com.ty.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.employeeapp.beans.Employee;
import com.ty.employeeapp.dto.EmployeeDto;
import com.ty.employeeapp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/index")
	public ModelAndView getHomePage(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		return modelAndView;
	}
	@GetMapping("/add-employee")
	public ModelAndView getAddTrainFormPage(ModelAndView modelAndView) {
		//modelAndView.setViewName("add-employee-form");
		modelAndView.setViewName("try");
		return modelAndView;
	}

	@PostMapping("/employees")
	public String saveEmployee(Employee employee, Model myModel) {
		EmployeeDto savedEmployee = employeeService.saveEmployee(employee);
		if (savedEmployee != null) {
			//return "redirect:/home";
			myModel.addAttribute("msg", "Employee Added ");
			return "display-employee";
		} else {
			return "redirect:/add-employee";
		}
	}
	@GetMapping("/display-all")
	public ModelAndView viewAllEmployees(ModelAndView modelAndView, Model model) {

		List<EmployeeDto> allEmployees = employeeService.getAllEmployee();
		model.addAttribute("employees", allEmployees);
		modelAndView.setViewName("display-all-employees");
		return modelAndView;
	}

	@GetMapping("/edit/{empId}")
	public ModelAndView getEditEmployeePage(ModelAndView modelAndView,Model model, @PathVariable("empId") int employeeId) {
		EmployeeDto searchedemployee = employeeService.searchEmployee(employeeId);
		if(searchedemployee == null) {
			model.addAttribute("msg", "Update Cannot be done because Data not found for employeeID "+employeeId);
			modelAndView.setViewName("display-train");
		} else {
			model.addAttribute("employee", searchedemployee);
			modelAndView.setViewName("edit-employee-page");
		}
		return modelAndView;
	}
	
	@PostMapping("/update-employee")
	public String updateEmployee(Employee employee,ModelAndView modelAndView,@RequestParam("employeeId")int employeeId) {
		EmployeeDto EmployeeDto = employeeService.updateEmployee(employeeId, employee);
		return "redirect:/display-all";
		
	}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int employeeId,Model model)
	{
		EmployeeDto deleteEmployee=employeeService.deleteEmployee(employeeId);
		if (deleteEmployee==null) {
			model.addAttribute("msg","delete employee cannot be done..."+employeeId);
			return "display-employee";
		} else {
			return "forward:/display-all";
		}
	}
	


}
