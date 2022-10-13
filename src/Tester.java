/**
 * @author Drumstyle92
 * class that contains the main.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method that contains an object and a method that shows the properties of the object.
     */
    public static void main(String[] args) {

        System.out.println("----------------------------Age---------------------------------------");
        Person person1 = new Person();

        System.out.println("--------------------------LiveStage------------------------------------");
        System.out.println("The person is in the " + person1.getLifeStage() + " stage of life");
    }
}
