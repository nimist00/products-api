package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Long getId() { return id; }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() { return name; } //removing name causes it to not appear. only id and price did. There was nothing for it to call

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() { return price; }

    public void setName(String name) {
        this.name = name;
    }
}
