package spring_MVC_Search;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	
	public String exceptionHandlerNull(Model m)
	{
		m.addAttribute("msg", "NullPointerException is occured");
		return "exception";
		
	}

	/* Generic error handle all exception */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m)
	{
		m.addAttribute("msg", "Exception is occured");
		return "exception";
		
	}

}
