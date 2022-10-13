/**
 * @author Drumstyle92
 * class that contains a variable, a constructor and a method with the if inside.
 */
public class Person {
    /**
     * the person's age.
     */
    public int age;

    /**
     * creation of the person and age.
     */
    public Person(){
        int min = 5;
        int max = 80;
        int numberAge = (int)Math.floor(Math.random()*(double)(max-min+1)+(double)min);
        this.age = numberAge;
        System.out.println("Creating a person is of his age: " + numberAge);
    }

    /**
     * @return returns a string with the person's life phase.
     * method that indicates the stage of life of the person.
     */
    public String getLifeStage(){
        String result = "";
        if(this.age <= 12){
            result = "The person is a child.";
        }else if(this.age >= 13 && this.age <= 19 ){
            result = "The person is a teen.";
        }else if(this.age >= 20 && this.age <= 59){
            result = "The person is an adult.";
        }else{
            result = "The person is senior adult";
        }
        return result;
    }
}
