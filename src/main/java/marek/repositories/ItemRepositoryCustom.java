package marek.repositories;

import java.util.List;

import marek.model.Item;

public interface ItemRepositoryCustom{

	public List<Item> findAll(Long id);
}
