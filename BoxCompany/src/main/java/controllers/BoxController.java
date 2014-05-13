package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import daos.BoxDAO;

@Controller
public class BoxController {
	@Autowired
	private BoxDAO bDao;
	
	@RequestMapping(value = "/")
	public String homePage(final HttpServletRequest request, final Model model){
		
		return "";
	}

}
