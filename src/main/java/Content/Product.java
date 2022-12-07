package Content;


public class Product {
    private int id;
    private String name;
    private int cost;

    public Product(){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }
    public void setCost() {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "id" + id + ",name =" + name + ",cost =" + cost;
    }

}
