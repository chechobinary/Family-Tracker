/**
 * Created by sergiobelengueruc on 23/07/2017.
 */
public class FamilyTracker {

    public static void main(String[] args){

        System.out.println("Welcome to Family Tracker");

        Family family = new Family();

        Person sergio = new Person("Sergio");
        Person esther = new Person("Esther");
        Person nerea = new Person("Nerea");

        family.add(sergio);
        family.add(nerea);
        family.add(esther);

        for (Person person:family) {
            System.out.println(person);
        }

        System.out.println(family);
    }
}
