import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FamilySet implements Iterable<Person> {

    private Set<Person> family = new TreeSet<>(Person.BY_NAME);

    public void add(Person person) {
        family.add(person);
    }

    public void remove(Person person) {
        family.remove(person);
    }

    public Iterator<Person> iterator() {
        return family.iterator();
    }

    @Override
    public String toString() {
        return "Set --> Number of members: " + family.size();
    }


}
