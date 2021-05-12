package spring_MVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Nikita Morankar");
		model.addAttribute("id", 12234);
		List<String> friends = new ArrayList<String>();
		friends.add("Shruti");
		friends.add("Hits");
		friends.add("Pd");
		friends.add("Vrushali");

		model.addAttribute("f", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("Helper page");
		//Creating the object of modelanview
		ModelAndView modelAndView=new ModelAndView();
		//Setting the data
		modelAndView.addObject("name" ,"Shweta Morankar");
		
		LocalDateTime now =	LocalDateTime.now();
		modelAndView.addObject("time" ,now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(123);
		list.add(124);
		list.add(125);
		modelAndView.addObject("marks" ,list);
		//Setting view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
