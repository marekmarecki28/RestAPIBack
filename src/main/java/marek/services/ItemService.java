package marek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marek.model.Item;
import marek.repositories.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> list()
	{
		return itemRepository.findAll();
	}
	
	public void add(Item item)
	{
		itemRepository.save(item);
	}
	
	public void remove(Long id)
	{
		itemRepository.deleteById(id);
	}

}
