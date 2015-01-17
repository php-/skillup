package skillup.garcha.task.car;

/**
 * @author skillup
 */
public class Car {
    
    private static int counter = 0;
            
    private int id;
    private String brand;
    private String model;
    private int year;
    
    private String color;
    private float price; 
    private String regNumber;
    
    
    public Car(String brand, String model, int year) {
        this.id = ++counter;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public static int getCounter() {
        return counter;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getId() {
        return id;
    }
    
    public float getPrice() {
        return price;
    }
    
}
