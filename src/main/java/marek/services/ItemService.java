package marek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marek.model.Item;
import marek.repositories.ItemRepository;
import marek.repositories.ItemRepositoryCustom;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> list(Long id)
	{
		return itemRepository.findAll(id);
	}
	
	public void addItems(List<Item> items)
	{
		itemRepository.saveAll(items);
	}
	
	public void addItem(Item item)
	{
		itemRepository.save(item);
	}
	
	public void remove(Long id)
	{
		itemRepository.deleteById(id);
	}

}
