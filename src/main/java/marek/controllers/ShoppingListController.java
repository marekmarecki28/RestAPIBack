package marek.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import marek.components.ResponseTransfer;
import marek.model.Item;
import marek.services.ItemService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ShoppingListController {
	
	@Autowired
    private ItemService itemService;

	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Item> getAllItems(@RequestParam Long id)
	{
		return itemService.list(id);
	}
	
	@RequestMapping(value="/list/add", method = RequestMethod.POST)
	public ResponseTransfer addItemsToList(@RequestBody List<Item> items) 
	{
		itemService.addItems(items);
		return new ResponseTransfer("Added items");
	}
	
	@RequestMapping(value="/list/remove", method = RequestMethod.DELETE)
	public ResponseTransfer removeItem(@RequestParam Long id)
	{
		itemService.remove(id);
		return new ResponseTransfer("Item removed");
	}
	
}
