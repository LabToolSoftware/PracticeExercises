package za.co.gavinmorris.cart.database;

import za.co.gavinmorris.cart.domain.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemDB {

    private static ItemDB instance;
    private Map<String, Item> items = new HashMap<String,Item>();

    private void ItemDb(){
        Item item1 = new Item("abcd","Item1","Item1 Description",1.00);
        Item item2 = new Item("abcde","Item2","Item2 Description",2.00);
        Item item3 = new Item("abcdef", "Item3","Item3 Description",3.00);
        Item item4 = new Item("abcdefg", "Item4","Item4 Description",4.00);
        Item item5 = new Item("abcdefgh", "Item5","Item5 Description",5.00);

        items.put(item1.getSku(),item1);
        items.put(item2.getSku(),item2);
        items.put(item3.getSku(),item3);
        items.put(item4.getSku(),item4);
        items.put(item5.getSku(),item5);
    }

    public static ItemDB getInstance(){
        if(instance==null){
            return new ItemDB();
        }
        else{
            return instance;
        }
    }

    public Item getItem(String itemID) {
        if(this.items.containsKey(itemID)){
            return items.get(itemID);
        }
        else{
            return null;
        }
    }
}