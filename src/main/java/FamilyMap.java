import java.util.HashMap;
import java.util.Map;

public class FamilyMap {

    private Map<String, Person> family = new HashMap<>();

    public void add(Person person) {
        family.put(person.getName(), person);
    };

    public void remove(Person person) {};

    public Map<String, Person> getFamily() {return family;}

    @Override
    public String toString() {
        return "Map --> Number of members: " + family.size();
    }

}
