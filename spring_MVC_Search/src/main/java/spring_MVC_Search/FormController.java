package spring_MVC_Search;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	
	@RequestMapping("/user/{userId}")
	public String getUser(@PathVariable ("userId") int userId)
	{
		System.out.println(userId);	
		return "home";
	}
	
	@RequestMapping("/complex")
	public String showform()
	{
		return "complex_form";
		
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String handlerform(@ModelAttribute ("student") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex_form";
		}
		System.out.println(student);
		return "success";
		
	}

} 
