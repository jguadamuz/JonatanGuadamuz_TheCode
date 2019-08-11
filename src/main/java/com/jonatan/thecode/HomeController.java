package com.jonatan.thecode;

//import java.util.Date;

//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class HomeController {
	
	public String secretCode = "bushido";
	
	@RequestMapping("")
//	public String home(HttpSession session, Model model, HttpServletRequest request) {
	public String home() {
	
//		session = request.getSession();
		
		return "index.jsp";
	}

	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String date(@RequestParam(value="code", required = false) String code, RedirectAttributes redirectAttributes, HttpSession session) {

		if (code.equals("")) {
			redirectAttributes.addFlashAttribute("error", "You didn't add any code!");
	        return "redirect:/";
		} else if (! code.equals(secretCode)) {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
	        return "redirect:/";
		} else {
			return "code.jsp";
		}
	}

}
