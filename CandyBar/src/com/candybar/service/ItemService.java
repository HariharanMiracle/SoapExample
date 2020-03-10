package com.candybar.service;

import com.candybar.model.Item;

public interface ItemService {
	
	public boolean addItem(Item item);
	
	public boolean deleteItem(int itemId);
	
	public Item getItem(int itemId);
	
	public Item[] getAllItems();

}
