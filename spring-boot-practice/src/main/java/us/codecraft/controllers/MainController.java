package us.codecraft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author code4crafter@gmail.com
 *         Date: 16/6/28
 *         Time: 上午9:26
 */
@Controller
public class MainController {

	@RequestMapping("/")
	// @ResponseBody
	public String index() {
		return "hello.html";
	}
}
