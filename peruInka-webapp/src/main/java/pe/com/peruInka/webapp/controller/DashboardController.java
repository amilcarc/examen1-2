package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.service.services.PeruInkaService;
import pe.com.peruInka.service.util.Person;

@Controller
public class DashboardController {
	
	@Autowired
	private PeruInkaService peruInkaService;

	@RequestMapping(value = "home/dashboard", method = RequestMethod.GET)
	public String dashboardDashboard(Model model, HttpServletRequest request) {
		model.addAttribute("listPerson", peruInkaService.findAllPerson());
		return "home/dashboard";
	}

	@RequestMapping(value = "home/frmPerson", method = RequestMethod.GET)
	public String frmPerson(Model model, HttpServletRequest request) {
		model.addAttribute("person", new Person());
		model.addAttribute("opc", "new");
		return "home/frmPerson";
	}
	
	
	
	@RequestMapping(value = "home/savePerson", method = RequestMethod.POST)
	public String savePerson(Model model, HttpServletRequest request,@ModelAttribute("person") Person person) {
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String lastNameP = request.getParameter("lastNameP");
		String opc = request.getParameter("opc");
		if(opc.equals("new")){
			peruInkaService.savePerson(person);
		}else{
			peruInkaService.updatePerson(person);
		}
		
		return "redirect:dashboard";
	}
	
	@RequestMapping(value = "home/deletePerson", method = RequestMethod.GET)
	public String deletePerson(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		peruInkaService.deletePerson(id);
		return "redirect:dashboard";
	}
	
	@RequestMapping(value = "home/editPerson", method = RequestMethod.GET)
	public String editPerson(Model model, HttpServletRequest request,@RequestParam("id_") Long id) {
		model.addAttribute("person", peruInkaService.searchPerson(id));
		model.addAttribute("opc", "update");
		return "home/frmPerson";
	}

}
