import javafx.beans.binding.ObjectExpression;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by sergiobelengueruc on 23/07/2017.
 */
public class Person {

    public static final Comparator<Person> BY_NAME = Comparator.comparing(Person::getName);

    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
