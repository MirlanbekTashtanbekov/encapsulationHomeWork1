public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;

    public Car(){
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(String brand){
        this.brand=brand;
        return brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(String model){
        this.model=model;
        return model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(int year){
        this.year=year;
        return year;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(String color){
        this.color=color;
        return color;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(int price){
        this.price=price;
        return price;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nCar: " +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nColor: " + color +
                "\nPrice: " + price ;
    }
}
