package marek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import marek.model.Item;
import marek.services.ItemService;

@RestController
public class ShoppingListController {
	
	@Autowired
    private ItemService itemService;

	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Item> getAllItems()
	{
		return itemService.list();
	}
	
	@RequestMapping(value="/list/add", method = RequestMethod.POST)
	@ResponseBody
	public String addItemToList(@RequestBody Item itemToBuy) 
	{
		System.out.println(itemToBuy.getName());
		System.out.println(itemToBuy.getQuantity());
		
		return "Added!";
	}
	
}
