/**
 * 
 */
package com.prabutdr.sfgrecipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author prabutdr
 *
 */
@Controller
public class IndexController { 

	@RequestMapping({"/", "/index"})
	public String getIndexPage() {
		System.out.println("This is for tes");
		return "index";
	}
}
 