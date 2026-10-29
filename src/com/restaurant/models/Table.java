package src.com.restaurant.models;

public class Table {
    public enum availability{
        occupy,free
    }
    private int id;
    private int capacity;
    private availability status;

    public Table(int id,int capacity){
        this.id=id;
        this.capacity=capacity;
        this.status=availability.free;
    }

    public int getID(){
        return id;
    }
    public int getCapacity(){
        return capacity;
    }
    public availability getStatus(){
        return status;
    }
    public void BookTable(){
        status=availability.occupy;
    }
    public void freeTable(){
        status=availability.free;
    }
    
}
