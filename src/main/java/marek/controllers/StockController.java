package marek.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import marek.model.Stock;

@RestController
public class StockController {

private static final String URL = "https://cloud.iexapis.com/stable/stock/ACN/chart/1m?token=pk_358f726d1c0542f49c384dceebbf6f4c";
	
	@RequestMapping("/stock")
	public Stock[] stock()
	{
		RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, Stock[].class);
	}
}
