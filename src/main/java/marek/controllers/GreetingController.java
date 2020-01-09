package marek.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import marek.model.Greeting;

@RestController
public class GreetingController {
	
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greet")
	public Greeting greet(@RequestParam(value="name", defaultValue="Maro") String name)
	{
		return new Greeting(counter.incrementAndGet(), "Hello!: " + name);
	}
}
