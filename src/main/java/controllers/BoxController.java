package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import daos.BoxAttributeDAO;
import daos.BoxDAO;
import entities.Box;


@Controller
public class BoxController {
	@Autowired
	private BoxAttributeDAO baDao;
	
	@Autowired
	private BoxDAO bDao;
	
	
	@RequestMapping(value = "/")
	public String homePage(final HttpServletRequest request, final Model model){
		List<Box> allBoxes = bDao.getAllBoxes();
		
		model.addAttribute("allBoxes", allBoxes);
		return "homepage";
	}
	
	@RequestMapping(value = "/catalog")
	public String catalogPage(final HttpServletRequest request, final Model model){
		
		return "";
	}
	
	
	public Box getABox(){
		
		return null;
	}
	
	public List<Box> getAllBoxes(){
		
		return null;
	}
	
	@RequestMapping(value = "/addBox", params = { "boxName", "boxPrice"},
			method = RequestMethod.POST)
	public void addABox(@RequestParam(value = "boxName") String name,
						@RequestParam(value = "boxPrice") String price){
		Box b = new Box(name);
		double d = 0;
		
		try{
			d = Double.parseDouble(price);
		}catch(NumberFormatException e){
			d = 0;
		}
		b.setPrice(d);
		
	}
	
	
}
