package Generics;

public class Product<T>{
    private T id;
    private T name;
    private T price;
    private T quantity;

    public Product(T id, T name, T price, T quantity) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(){}

    @Override
    public String toString() {
        return "Generics.Product{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public T getId() {
        return id;
    }

    public T getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public T getQuantity() {
        return quantity;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public void setQuantity(T quantity) {
        this.quantity = quantity;
    }
}
