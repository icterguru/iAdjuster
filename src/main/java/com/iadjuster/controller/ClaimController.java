package com.iadjuster.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.iadjuster.model.Claim;
import com.iadjuster.model.ClaimReport;
import com.iadjuster.service.ClaimService;

@Controller
@SessionAttributes("claim")
public class ClaimController {

	@Autowired
	private ClaimService claimService;

	@RequestMapping(value = "addClaim", method = RequestMethod.GET)
	public String addClaim(Model model, HttpSession session) {
		//Claim claim = new Claim();
		Claim claim = (Claim) session.getAttribute("claim");

		if(claim == null){
			claim = new Claim();
			claim.setClaimNo(101);
			claim.setClaimType("Auto");;

		}
		model.addAttribute("claim", claim);

		return "addClaim";
	}

	@RequestMapping(value = "addClaim", method = RequestMethod.POST)
	public String updateClaim(@Valid @ModelAttribute("claim") Claim claim, BindingResult result) {

		System.out.println("result has errors: " + result.hasErrors());

		System.out.println("Claim No: " + claim.getClaimNo());
		System.out.println("Claim Type: " + claim.getClaimType());
		

		if(result.hasErrors()) {
			return "addClaim";
		}
		else{
			claimService.save(claim);
		}

		
		return "redirect:addAdjinfo.html";
	}

	@RequestMapping(value="getClaims", method = RequestMethod.GET)
	public String getClaims(Model model) {
		List<Claim> claims = claimService.findAllClaims();

		model.addAttribute("to_claimreport", claims);
						// To be used in getClaims.jsp file

		return "getClaims";
	}


	@RequestMapping(value="getClaimReports", method = RequestMethod.GET)
	public String getClaimReports(Model model) {
		List<ClaimReport> claimReports = claimService.findAllClaimReports();

		model.addAttribute("to_claimReports",	claimReports);

							// To be used in getClaimReorts.jsp file
		
		return "getClaimReports";
	}

}


