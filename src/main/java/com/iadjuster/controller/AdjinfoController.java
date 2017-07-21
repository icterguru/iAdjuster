package com.iadjuster.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iadjuster.model.Claim;
import com.iadjuster.model.Task;
import com.iadjuster.model.Work;
import com.iadjuster.service.WorkService;


@Controller
public class AdjinfoController {

	@Autowired
	private WorkService workService;
	
	@RequestMapping(value = "/addAdjinfo",  method = RequestMethod.GET)
	public String getClaimNo(@ModelAttribute ("work") Work work) {
	
		return "addAdjinfo";
	}
	
	@RequestMapping(value = "/addAdjinfo",  method = RequestMethod.POST)
	public String addClaimNo(@Valid @ModelAttribute ("work") Work work, HttpSession session, BindingResult result) {
		
		System.out.println("Adjustment workHour: " + work.getWorkHour());
		System.out.println("Adjustment task: " + work.getTask());

		System.out.println("Insured's Name: " + work.getInsuredName());
		System.out.println("Insured's Contact: " + work.getInsuredContact());
		System.out.println("Insurance Name: " + work.getInsuranceName());
		System.out.println("Insurance Type: " + work.getInsuranceType());
			
	
		System.out.println("Claim StartDate: " + work.getClaimStartDate());
		System.out.println("Claim DueDate: " + work.getClaimDueDate());
	
		System.out.println("Adjuster's Id: " + work.getAdjusterId());	
		System.out.println("Adjuster's Name: " + work.getAdjusterName());
		
		
		if(result.hasErrors()) {
			return "addAdjinfo";
		}
		else{
			Claim claim = (Claim) session.getAttribute("claim");
			work.setClaim(claim);
			workService.save(work);
			
		}
		
		return "addAdjinfo";
	}
	
	@RequestMapping(value = "/tasks", method = RequestMethod.GET)
	public @ResponseBody List<Task> findAllTasks() {
		return workService.findAllTasks();
	}
	
}
