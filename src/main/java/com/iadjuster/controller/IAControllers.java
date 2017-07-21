package com.iadjuster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// http://stackoverflow.com/questions/8960886/how-to-display-text-and-images-both-in-same-jsp-page-in-easiest-way


@Controller
public class IAControllers {

	@RequestMapping(value ="/about")
	public String aboutHandler (Model model) {

		//	model.addAttribute("about", "Welcome to iAdjuster");

		return "about";
	}

	@RequestMapping(value ="/welcome")
	public String welcomeHandler (Model model) {

		//model.addAttribute("home", "HomePage of iAdjuster");

		return "welcome";
	}

	@RequestMapping(value ="/hello")
	public String helloHandler (Model model) {

		model.addAttribute("greeting", "Hello World");

		return "hello"; // returns hello.jsp as hello.html
	}

	@RequestMapping(value = "/login")
	public String loginHandler(){
		return "login";
	}

	@RequestMapping(value ="/bootstrap")
	public String bootstrapHandler (Model model) {

		//model.addAttribute("home", "HomePage of iAdjuster");

		return "bootstrap";
	}

	@RequestMapping(value ="/home")
	public String homeHandler (Model model) {

		//model.addAttribute("home", "HomePage of iAdjuster");

		return "home";
	}

	@RequestMapping(value ="/postuser")
	public String testFormHandler (Model model) {

		//model.addAttribute("greeting", "Hello World");

		return "form_postuser";
	}

	@RequestMapping(value ="/images")
	public String imagesHandler (Model model) {

		//	model.addAttribute("greeting", "Hello World");

		return "images";
	}

	@RequestMapping(value ="/maps")
	public String mapsHandler (Model model) {

		return "maps";
	}

	@RequestMapping(value ="/direction")
	public String directionHandler (Model model) {

		return "direction";
	}


	@RequestMapping(value ="/menu")
	public String menuHandler (Model model) {

		return "menu";
	}

	@RequestMapping(value ="/video")
	public String videoHandler (Model model) {

		//	model.addAttribute("video", "Hello Video World");

		return "video";
	}

	@RequestMapping(value ="/videos")
	public String videosHandler (Model model) {

		//	model.addAttribute("videos", "Hello Videos World");

		return "videos";
	}

}
