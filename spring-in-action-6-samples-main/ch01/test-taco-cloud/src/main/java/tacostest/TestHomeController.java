package tacostest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestHomeController {
	
	@GetMapping("/")  //Handles requests for the root path /
	public String home() {
		return "home"; //Returns the view name
	}

}
