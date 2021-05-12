package spring_MVC_Search;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		
//		  String str=null;
//		  System.out.println(str.length());
		 
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);

		return redirectView;
	}

	/*
	 * @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	 * 
	 * public String exceptionHandlerNull(Model m) { m.addAttribute("msg",
	 * "NullPointerException is occured"); return "exception";
	 * 
	 * }
	 * 
	 * Generic error handle all exception
	 * 
	 * @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value=Exception.class) public String
	 * exceptionHandlerGeneric(Model m) { m.addAttribute("msg",
	 * "Exception is occured"); return "exception";
	 * 
	 * }
	 */
}
