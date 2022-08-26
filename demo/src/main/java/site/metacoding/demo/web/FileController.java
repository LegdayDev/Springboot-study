package site.metacoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileController {
	@GetMapping("/file/home")
	public String home() {
		return "home";
	}
}
