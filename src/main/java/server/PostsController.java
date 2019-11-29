package server;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
public class PostsController {

	private final AtomicLong counter = new AtomicLong();

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/posts")
	public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
		System.out.println(name);
		return "Hello World!";
	}
}
