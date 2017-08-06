import org.junit.Test;


import static org.junit.Assert.assertThat;
import org.hamcrest.collection.IsMapContaining;

import java.util.HashMap;
import java.util.Map;

public class FamilyMapTest {



    @Test
    public void shouldAddItems() throws Exception {

        FamilyMap test = new FamilyMap();

        Person otherMember = new Person("otherMember");
        test.add(otherMember);

        assertThat(test.getFamily(), IsMapContaining.hasEntry("otherMember", otherMember));
    }

}
