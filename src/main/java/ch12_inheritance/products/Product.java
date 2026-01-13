package ch12_inheritance.products;

// 쉬움
public class Product extends Item{
    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
