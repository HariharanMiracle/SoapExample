package com.candybar.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.candybar.model.Item;
public class ItemServiceImpl implements ItemService {

	private static Map<Integer,Item> items = new HashMap<Integer,Item>();
	
	@Override
	public boolean addItem(Item item) {
		// TODO Auto-generated method stub
		if(items.get(item.getItemId()) != null) return false;
		items.put(item.getItemId(), item);
		return true;
	}

	@Override
	public boolean deleteItem(int itemId) {
		// TODO Auto-generated method stub
		if(items.get(itemId) == null) return false;
		items.remove(itemId);
		return true;
	}

	@Override
	public Item getItem(int itemId) {
		// TODO Auto-generated method stub
		return items.get(itemId);
	}

	@Override
	public Item[] getAllItems() {
		// TODO Auto-generated method stub
		Set<Integer> ids = items.keySet();
		Item[] it = new Item[ids.size()];
		int i=0;
		for(Integer id : ids){
			it[i] = items.get(id);
			i++;
		}
		return it;
	}

}
