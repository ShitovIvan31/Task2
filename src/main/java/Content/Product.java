package Content;


public class Product {
    private int id;
    private String name;
    private int price;

    public Product(){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, int price) {
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
        return price;
    }
    public void setCost() {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id" + id + ",name =" + name + ",cost =" + price;
    }

}
