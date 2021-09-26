package excercises.inheritance;

public class Computer {

    private int ram;
    private int storage;
    private boolean hasKeybaord;

    public Computer(int ram, int storage, boolean hasKeybaord){
        this.ram = ram;
        this.storage = storage;
        this.hasKeybaord = hasKeybaord;

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isHasKeybaord() {
        return hasKeybaord;
    }

    public void setHasKeybaord(boolean hasKeybaord) {
        this.hasKeybaord = hasKeybaord;
    }

    public void startComputer(){
        System.out.println("Computer starting:\n" +
                "System memory: "+ this.ram+
                "System storage: "+ this.storage);
    }

    public void shutDown(){
        System.out.println("System powering down....good bye!");
    }

}
