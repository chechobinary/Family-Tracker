import java.util.Collection;
import java.util.Set;

/**
 * Created by sergiobelengueruc on 23/07/2017.
 */
public class FamilyTracker {

    public static void main(String[] args){

        System.out.println();
        System.out.println("Welcome to Family Tracker");
        System.out.println();

        Person sergio = new Person("Sergio", "Garcia Belenguer");
        Person nerea = new Person("Nerea", "Garcia Garcia");
        Person esther = new Person("Esther", "Garcia Briz");

        System.out.println("Set testing...");
        FamilySet familySet = new FamilySet();

        familySet.add(sergio);
        familySet.add(nerea);
        familySet.add(esther);

        for (Person person:familySet) {
            System.out.println(person);
        }

        System.out.println(familySet);
        System.out.println();

        System.out.println("Map testing...");
        FamilyMap familyMap = new FamilyMap();

        familyMap.add(esther);
        familyMap.add(sergio);
        familyMap.add(nerea);

        Collection<Person> values = familyMap.getFamily().values();

        for (Person person:values) {
            System.out.println(person);
        }

        System.out.println(familyMap);
        System.out.println();

    }
}

