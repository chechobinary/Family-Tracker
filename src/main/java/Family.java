import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sergiobelengueruc on 23/07/2017.
 */
public class Family implements Iterable<Person> {

    private Set<Person> family = new TreeSet<>(Person.BY_NAME);

    public void add(Person person) { family.add(person); }

    public void remove(Person person) { family.remove(person); }

    public Iterator<Person> iterator() {
        return family.iterator();
    }

    @Override
    public String toString() {
        return "Number of members: " + family.size();
    }
}
