package marek;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import marek.model.Quote;

@RestController
public class QuoteController 
{
	
	private static final String URL = "https://gturnquist-quoters.cfapps.io/api/random";
	
	@RequestMapping(value = "/quote", method = RequestMethod.GET)
	public String quote()
	{
		RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, Quote.class).getValue().getQuote();
	}

}
