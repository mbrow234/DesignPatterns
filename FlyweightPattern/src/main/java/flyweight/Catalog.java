package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/2/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */

//Catalog acts as a facotry and cache for Item flyweight objects
public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    //factory method
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
