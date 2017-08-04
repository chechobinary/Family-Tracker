/**
 * Created by sergiobelengueruc on 24/07/2017.
 */
public class FamilyTestData {

    public static final Person sergio = new Person("Sergio");
    public static final Person esther = new Person("Esther");
    public static final Person nerea = new Person("Nerea");

    public static Family family = new Family();

    static {
        family.add(sergio);
        family.add(esther);
        family.add(nerea);
    }
}
