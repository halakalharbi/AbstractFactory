package abstractfactory;

// Factory producer class
public class FactoryProducer {
    // Returns the appropriate factory based on the computer type
    public static ComputerFactory getFactory(String type) {
        if (type.equalsIgnoreCase("PC")) {
            return new PCFactory();
        } else if (type.equalsIgnoreCase("Server")) {
            return new ServerFactory();
        } else {
            return null;
        }
    }
}
