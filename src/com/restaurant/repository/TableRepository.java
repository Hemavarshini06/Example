package src.com.restaurant.repository;

import java.util.ArrayList;
import java.util.List;
import src.com.restaurant.models.Table;

public class TableRepository {
    private final List<Table> tables=new ArrayList<>();

    public TableRepository(){
        tables.add(new Table(1,4));
        tables.add(new Table(2,7));
        tables.add(new Table(3,4));
    }
    public List <Table> show(){
        return tables;
    }
}
