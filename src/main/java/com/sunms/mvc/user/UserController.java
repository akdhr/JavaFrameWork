package com.sunms.mvc.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunms.domain.User;
import com.sunms.service.userService.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired	
	private UserService userService;

	@RequestMapping(value = "/getUser", params = "id")
	public String displayUser(String id, HashMap<String, Object> param) {
		System.out.println("fuck");
		User user = userService.getUser(Integer.valueOf(id));
		param.put("user", user);
		return "/user/displayUser";
	}
}
