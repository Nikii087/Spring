package spring_MVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
// @RequestMapping("/hitesh")
public class RedirectController {

	// type - 1 redirect using RedirectView class return type must be
	// RedirectView
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("one handler was called.");
		// create object of redirect view
		RedirectView redirectView = new RedirectView();
		// redirectView.setUrl("two"); //don't give right slash
		redirectView.setUrl("https://getbootstrap.com/docs/5.0/components/alerts/"); // don't
																						// give
																						// right
																						// slash
		return redirectView;
	}

	// type - 2
	// @RequestMapping("/one")
	// public String one(){
	// System.out.println("one handler was called.");
	// //its will redirect automatically on /two method internally
	// return"redirect:/two";
	// }

	@RequestMapping("/two")
	public String two() {
		System.out.println("two handler was called.");
		return "/contact";
	}
}