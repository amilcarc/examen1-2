package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.service.services.PeruSucursal;
import pe.com.peruInka.service.util.Sucursal;

@Controller
public class SucursalController {
	
	@Autowired
	private PeruSucursal perusucursal;

	@RequestMapping(value = "home/sucursal", method = RequestMethod.GET)
	public String sucursalSucursal(Model model, HttpServletRequest request) {
		model.addAttribute("sucSucursal", perusucursal.findAllSucursal());
		return "home/sucursal";
	}

	@RequestMapping(value = "home/frmsucursal", method = RequestMethod.GET)
	public String frmsucursal(Model model, HttpServletRequest request) {
		model.addAttribute("sucursal", new Sucursal());
		model.addAttribute("opc", "new");
		return "home/frmsucursal";
	}
	
	
	
	@RequestMapping(value = "home/saveSucursal", method = RequestMethod.POST)
	public String saveSucursal(Model model, HttpServletRequest request,@ModelAttribute("sucursal") Sucursal sucursal) {
		
		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			perusucursal.saveSucursal(sucursal);
		}else{
			perusucursal.updateSucursal(sucursal);
		}
		
		return "redirect:sucursal";
	}
	
	@RequestMapping(value = "home/deleteSucursal", method = RequestMethod.GET)
	public String deleteSucursal(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		perusucursal.deleteSucursal(id);
		return "redirect:sucursal";
	}
	
	@RequestMapping(value = "home/editSucursal", method = RequestMethod.GET)
	public String editSucursal(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("sucursal", perusucursal.searchSucursal(id));
		model.addAttribute("opc", "update");
		return "home/frmsucursal";
	}
	
}