package homework_11_06_23.devices;

import homework_11_02_23.components.Mouse;
import homework_11_02_23.computer.Computer;
import homework_11_06_23.interfaces.Upgradable;

// Laptop Class
public class Laptop extends Computer implements Upgradable {
    // Field for the Laptop class
    private int batteryLifeInHours;

    // Default constructor for Laptop
    public Laptop() {
        super();
        setBatteryLifeInHours(0);
        this.setCpu(new homework_11_02_23.components.CPU());
        this.setGpu(new homework_11_02_23.components.GPU());
        this.setRam(new homework_11_02_23.components.RAM());
        this.setKeyboard(new homework_11_02_23.components.Keyboard());
        this.setMonitor(new homework_11_02_23.components.Monitor());
        this.setMouse(new homework_11_02_23.components.Mouse());
    }

    // Constructor for the Laptop class
    public Laptop(int batteryLifeInHours, String brand, String model, boolean isUpgradable, homework_11_02_23.components.CPU cpu, homework_11_02_23.components.GPU gpu, homework_11_02_23.components.RAM ram, homework_11_02_23.components.Keyboard keyboard, homework_11_02_23.components.Monitor monitor, Mouse mouse) {
        super(brand, model, isUpgradable, cpu, gpu, ram, keyboard, monitor, mouse);
        setBatteryLifeInHours(batteryLifeInHours);
        this.setCpu(cpu);
        this.setGpu(gpu);
        this.setRam(ram);
        this.setKeyboard(keyboard);
        this.setMonitor(monitor);
        this.setMouse(mouse);
    }

    // Override the printInfo method to print Laptop information
    @Override
    public void printInfo() {
        System.out.print("Laptop: ");
        super.printInfo();
        // Additional info for Laptop
        System.out.println(" Battery Life In Hours: " + getBatteryLifeInHours() +
                " CPU: " + this.getCpu().getModel() +
                ", GPU: " + this.getGpu().getModel() +
                ", RAM: " + this.getRam().getCapacity() +
                ", Keyboard: " + this.getKeyboard().getType() +
                ", Monitor: " + this.getMonitor().getType() +
                ", Mouse: " + this.getMouse().getType());
    }

    // Check if the device is upgradable and perform the upgrade if possible; otherwise, indicate that it is not upgradable
    @Override
    public void upgrade() {
        if (super.isUpgradable()) {
            System.out.println("\nLaptop is upgradable. Performing the upgrade...");
            // Add upgrade logic here
        } else {
            System.out.println("\nLaptop is not upgradable.");
        }
    }

    // Getter method for BatteryLifeInHours
    public int getBatteryLifeInHours() {
        return batteryLifeInHours;
    }

    // Setter method for BatteryLifeInHours
    public void setBatteryLifeInHours(int batteryLifeInHours) {
        this.batteryLifeInHours = batteryLifeInHours;
    }
}