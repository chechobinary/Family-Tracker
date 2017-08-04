
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sergiobelengueruc on 24/07/2017.
 */
public class PersonTest {


    @Test
    public void shouldCreatePersonWithName() {

        Person person = new Person("name");

        assertEquals(person.getName(), "name");
    }

    @Test
    public void shouldChangeName() {

        Person person = new Person("name");
        person.setName("otherName");

        assertEquals(person.getName(), "otherName");
    }

    @Test
    public void shouldPrintPerson() {

        Person person = new Person("name");

        assertEquals(person.toString(), "Name: " + person.getName());
    }


}
