package com.dilip.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class UserServiceController {

	/*@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status login(@RequestBody User user) {
		Status loginResponsc = userService.logIn(user);
		return loginResponsc;

	}

	@RequestMapping(value = "/logout/{userId}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status logOut(@PathVariable(value = "userid") String userId) {
		return null;

	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status signUp(@RequestBody User user) {
		Status signupResponse = userService.signUp(user);
		return signupResponse;

	}*/

	/*@RequestMapping(value = "/changepassword", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Status changePassword(@RequestBody Password password) {
		return userService.changepasswor(password);

	}*/

	// @RequestMapping(value="/pow", method=RequestMethod.GET)
	// (@RequestParam(value="base") int base1)

	// @RequestMapping("/sqrt/{num}")
	// public double sqrt(@PathVariable(value="num") int num1)
}
