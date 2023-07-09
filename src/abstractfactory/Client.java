package abstractfactory;

public class Client {
    public static void main(String[] args) {
        // Create a PC factory using the abstract factory
        ComputerFactory pcFactory = FactoryProducer.getFactory("PC");

        // Create a PC computer
        Computer pc = pcFactory.createComputer("2 GB", "500 GB", "2.4 GHz");
        System.out.println("PC Configuration:");
        System.out.println("CPU: " + pc.getCPU());
        System.out.println("HDD: " + pc.getHDD());
        System.out.println("RAM: " + pc.getRAM());

        // Create a server factory using the abstract factory
        ComputerFactory serverFactory = FactoryProducer.getFactory("Server");

        // Create a server computer
        Computer server = serverFactory.createComputer("16 GB", "1 TB", "2.9 GHz");
        System.out.println("\nServer Configuration:");
        System.out.println("CPU: " + server.getCPU());
        System.out.println("HDD: " + server.getHDD());
        System.out.println("RAM: " + server.getRAM());
    }
}
