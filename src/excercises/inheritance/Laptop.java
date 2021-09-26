package excercises.inheritance;

public class Laptop extends Computer{

    private double weight;

    public Laptop(int ram, int storage, boolean hasKeybaord, double weight) {
        super(ram, storage, hasKeybaord);
        this.weight = weight;
    }


    @Override
    public void startComputer() {
        System.out.println("Computer starting:\n" +
                "System memory: "+ getRam()+
                "\nSystem storage: "+ getStorage()+
                "\nWelcome.....");
    }

    @Override
    public void shutDown() {
        super.shutDown();
    }
}
