package src.com.restaurant.services;

import java.util.List;

import src.com.restaurant.models.Table;
import src.com.restaurant.repository.TableRepository;

public class TableServices {
    private final TableRepository repository;

    public TableServices(){
        repository=new TableRepository();
    }

    public List<Table> getAll(){
        return repository.show();
    }
    
    // public Tables getTableById(int tableId) {
    //     return repository.findById(tableId);
    // }
}
