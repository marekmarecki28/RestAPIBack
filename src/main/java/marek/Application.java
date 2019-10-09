package marek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import marek.model.Quote;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
