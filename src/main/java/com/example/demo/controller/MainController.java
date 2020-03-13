package com.example.demo.controller;

import com.example.demo.Phone;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
	public class MainController {
	 
	    // ​​​​​​​
	    // Вводится (inject) из application.properties.
	    @Value("${welcome.message}")
	    private String message;
	 
	    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	    public String index(Model model) {
			List<Phone> lp = new ArrayList<>();
			lp.add(new Phone("Флока", "111111"));
			lp.add(new Phone("Иванов", "22222"));
			lp.add(new Phone("Петров", "33333"));

			model.addAttribute("message", message);
			model.addAttribute("phones", lp);

			return "index";

		}

}
