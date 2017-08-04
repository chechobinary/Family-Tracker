
import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;



/**
 * Created by sergiobelengueruc on 23/07/2017.
 */
public class FamilyTest {


    @Test
    public void shouldAddItems() throws Exception {

        Person otherMember = new Person("otherMember");

        FamilyTestData.family.add(otherMember);
        assertThat(FamilyTestData.family, containsInAnyOrder(FamilyTestData.sergio, FamilyTestData.esther, FamilyTestData.nerea, otherMember));
    }

    @Test
    public void shouldRemoveItems() throws Exception {

        Person otherMember = new Person("otherMember");
        FamilyTestData.family.remove(otherMember);

        assertThat(FamilyTestData.family, containsInAnyOrder(FamilyTestData.sergio, FamilyTestData.esther, FamilyTestData.nerea));
    }

    @Test
    public void ShouldAddDuplicateItems() throws Exception {

        FamilyTestData.family.add(new Person("Nerea"));

        assertThat(FamilyTestData.family, containsInAnyOrder(FamilyTestData.sergio, FamilyTestData.esther, FamilyTestData.nerea));

    }


}
