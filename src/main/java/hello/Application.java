package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	@RequestMapping("/api")
	public String api() {
		return "Hello Docker Api";
	}

	@RequestMapping("/otherside")
	public String otherside() {
		return "Hello Otherside";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
