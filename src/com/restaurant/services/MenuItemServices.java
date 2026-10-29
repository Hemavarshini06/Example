package src.com.restaurant.services;

import java.util.List;
import src.com.restaurant.models.MenuItem;
import src.com.restaurant.models.MenuItem.Availability;
import src.com.restaurant.repository.MenuItemRepository;

public class MenuItemServices {

    private final MenuItemRepository repository;

    public MenuItemServices() {
        repository = new MenuItemRepository();
    }

    public List<MenuItem> getAll() {
        return repository.show();
    }

    public boolean addItem(MenuItem item) {
        if (item == null || item.getId() <= 0
                || item.getName() == null
                || item.getPrice() <= 0) {
            return false;
        }

        repository.add(item);
        return true;
    }


    public void removeItem(int id) {
        repository.remove(id);
    }


    public int countItems() {
        return repository.count();
    }


    public boolean updateAvailability(int id, Availability status) {
        MenuItem item = repository.findById(id);

        if (item == null || status == null) {
            return false;
        }

        item.setAvailable(status);
        return true;
    }
}

    

