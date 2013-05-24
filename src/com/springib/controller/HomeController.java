package com.springib.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springib.model.ibatis.RucDao;

@Controller
@RequestMapping("/index.htm")
public class HomeController{
	
	@Autowired
	private RucDao rucDao;
 
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      
      List lista =  rucDao.selectAll();
      model.addAttribute("lista", lista);
      return "hello";
   }

}