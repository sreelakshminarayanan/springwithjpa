package io.sree;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final String Hello_field = "hi";

	@RequestMapping("/")
	public String sayHi() {
		return Hello_field;
	}
}
