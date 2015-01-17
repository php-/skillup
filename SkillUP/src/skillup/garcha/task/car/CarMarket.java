package skillup.garcha.task.car;

/**
 * @author skillup
 */
public class CarMarket {
    
    private static Car[] cars;
    private static String[] brands;
    
    public static void main(String[] args) {
        System.out.println("Welcome to the world's best car Market");
        
        
    }
    
    public static void createSomeCars(int count) {
        cars = new Car[count];
        
         
        Car tmpCar;
        
        for(int i = 0; i < count; i++)
        {
            tmpCar = BasicCarFactory.createCar("BMW", "D5", 1900);
            cars[i] = tmpCar;
        }
        
        
    }
}
