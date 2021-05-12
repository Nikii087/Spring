package spring_MVC_Search;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {
	
	@RequestMapping("/home1")
	public String home1()
	{
		return "home1";
	}
	
	@RequestMapping(value="/welcome")
	public String welcome(@RequestParam ("user") String name,Model m)
	{
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcome";
	}

}
