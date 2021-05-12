package spring_MVC.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring_MVC.model.User;
import spring_MVC.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("head", "Spring MVC Code");
		model.addAttribute("desc", "- code with <i>Nikita Morankar</i> ");
	}

	@RequestMapping("/contact")
	public String showform() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleform(@ModelAttribute User user,Model model) {
		this.userService.createUser(user);
		int createdUser = userService.createUser(user);
		model.addAttribute("msg", "User have created successfully with id = " + createdUser);
		System.out.println(user);

		
		return "success";
	}

}

/*
 * public String handleform(@RequestParam(name="email" ,required=true) String
 * email,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("pass") String pass ,Model model) {
 * 
 * 
 * System.out.println("Email is:" +email); System.out.println("Name is:"
 * +userName); System.out.println("Password is:" +pass);
 * 
 * model.addAttribute("email", email); model.addAttribute("userName", userName);
 * model.addAttribute("pass", pass);
 * 
 * 
 * User user=new User(); user.setEmail(email); user.setPass(pass);
 * user.setUserName(userName);
 * 
 * System.out.println(user);
 * 
 * model.addAttribute("user", user); return "success"; }
 * 
 * }
 */