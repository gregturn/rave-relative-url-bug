package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/subUrl/{name}")
	public ModelAndView subUrl(@PathVariable String name) {
		System.out.println("Received " + name);
		return new ModelAndView("subUrl")
			.addObject("name", name);
	}
}
