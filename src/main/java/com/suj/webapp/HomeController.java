package com.suj.webapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/*
	 * @RequestMapping("home") public String home(HttpServletRequest req,
	 * HttpServletResponse res) { String name = req.getParameter("name");
	 * System.out.println("Hello Home..."+name); HttpSession session =
	 * req.getSession(); session.setAttribute("name", name); return "home"; }
	 */
	
	/*
	 * @RequestMapping("home") public String home(@RequestParam("name") String name,
	 * HttpSession session) { ModelAndView mv = new ModelAndView();
	 * System.out.println("Hello Home... "+name); session.setAttribute("name",
	 * name); return "home"; }
	 */
	
	/*
	 * @RequestMapping("home") public ModelAndView home(@RequestParam("name") String
	 * myName) { ModelAndView mv = new ModelAndView(); mv.addObject("name", myName);
	 * mv.setViewName("home"); return mv; }
	 */
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
}

