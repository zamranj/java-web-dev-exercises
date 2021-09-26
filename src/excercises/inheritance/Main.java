package excercises.inheritance;

public class Main {

    public static void main(String[] args) {
        Laptop asus = new Laptop(32, 300, true, 2.5);
        asus.startComputer();

        SmartPhone razor = new SmartPhone(16,128,false,5.5);
        razor.startComputer();

    }

}
