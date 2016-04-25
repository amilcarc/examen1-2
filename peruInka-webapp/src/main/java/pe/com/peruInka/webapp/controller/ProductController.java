package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.service.services.PeruProducto;
import pe.com.peruInka.service.util.Product;

@Controller
public class ProductController {
	
	@Autowired
	private PeruProducto peruproduct;

	@RequestMapping(value = "home/producto", method = RequestMethod.GET)
	public String productProduct(Model model, HttpServletRequest request) {
		model.addAttribute("prodProducto", peruproduct.findAllProduct());
		return "home/producto";
	}

	@RequestMapping(value = "home/frmproducto", method = RequestMethod.GET)
	public String frmsucursal(Model model, HttpServletRequest request) {
		model.addAttribute("producto", new Product());
		model.addAttribute("opc", "new");
		return "home/frmproducto";
	}
	
	
	
	@RequestMapping(value = "home/saveProduct", method = RequestMethod.POST)
	public String saveProduct(Model model, HttpServletRequest request,@ModelAttribute("producto") Product producto) {

		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			peruproduct.saveProduct(producto);
		}else{
			peruproduct.updateProduct(producto);
		}
		
		return "redirect:producto";
	}
	
	@RequestMapping(value = "home/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		peruproduct.deleteProduct(id);
		return "redirect:producto";
	}
	
	@RequestMapping(value = "home/editProduct", method = RequestMethod.GET)
	public String editSucursal(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("producto", peruproduct.searchProduct(id));
		model.addAttribute("opc", "update");
		return "home/frmproducto";
	}
	
}