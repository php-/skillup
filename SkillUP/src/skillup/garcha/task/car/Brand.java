package skillup.garcha.task.car;

/**
 * @author George Garchagudashvili <george.garcha@gmail.com>
 */
public abstract class Brand {
    protected static String name;
    protected BasicCarFactory carFactory;
    
    public Brand(String name, BasicCarFactory factory) {
        this.name = name;
        this.carFactory = factory;
    }
    
    public String getName() {
        return name;
    }
    
}
