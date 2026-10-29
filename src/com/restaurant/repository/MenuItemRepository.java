package src.com.restaurant.repository;

import java.util.ArrayList;
import java.util.List;
import src.com.restaurant.models.MenuItem;

public class MenuItemRepository {

    private final List<MenuItem> menuItems = new ArrayList<>();

    public List<MenuItem> show() {
        return new ArrayList<>(menuItems);
    }

    public void add(MenuItem item) {
        menuItems.add(item);
    }

    public void remove(int id) {
        for (MenuItem item : menuItems) {
            if (item.getId() == id) {
                menuItems.remove(item);
                break;
            }
        }
    }

    public MenuItem findById(int id) {
        for (MenuItem items : menuItems) {
            if (items.getId() == id) {
                return items;
            }
        }
        return null;
    }

    public int count(){
        return menuItems.size();
    }


}
