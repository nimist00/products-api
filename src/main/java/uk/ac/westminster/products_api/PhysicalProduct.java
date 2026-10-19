package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double weightKg, double price, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public String getDimensions(){
        return dimensions;
    }

    public double getWeightKg(){
        return weightKg;
    }
}
