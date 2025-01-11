package nstarlike.openbanking.auth.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class AuthController {

	@RequestMapping("/")
	public String index() {
		return "Welcome!";
	}

	@PostMapping("/authenticate")
	public String authenticate() {
		return "You are authenticated!";
	}
	
	@PostMapping("/authorization")
	public String authorization() {
		return "You are authorized!";
	}

}
