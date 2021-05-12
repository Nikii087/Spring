package productApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productApp.dao.ProductDao;
import productApp.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		List<Product> products=productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
	}
	
	//Show product form
	@RequestMapping("/add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "Add Product");
		return "addProduct";
	}
	
	//Handle product form
	@RequestMapping(value="/handle-product" ,method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		RedirectView redirectView =new RedirectView();
		System.out.println(product);
		this.productDao.createProduct(product);
		redirectView.setUrl(request.getContextPath()+"/");		
		return redirectView;
		
	}
	
	//Delete product
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId , HttpServletRequest request)
	{
		this.productDao.deleteProducts(productId);
		RedirectView redirectView =new RedirectView();
		System.out.println(productId);
		
		redirectView.setUrl(request.getContextPath()+"/");		
		return redirectView;
		
		
	}
	
	// update handler
		@RequestMapping("/update/{productId}")
		public String updateProduct(@PathVariable("productId") int productId, Model model) {

			Product oldProduct = this.productDao.getProduct(productId);

			model.addAttribute("title", "Update-Form");
			model.addAttribute("product", oldProduct);
			return "update_form";
		}
}
