import java.util.HashMap;
import java.util.Map;

public class FamilyMap implements FamilyCollections {

    private Map<String, Person> family = new HashMap<>();

    @Override
    public void add(Person person) {
        family.put(person.getName(), person);
    };

    @Override
    public void remove(Person person) {};

    public Map<String, Person> getFamily() {return family;}

    @Override
    public String toString() {
        return "Map --> Number of members: " + family.size();
    }

}
