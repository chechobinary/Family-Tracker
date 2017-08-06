/**
 * Created by sergiobelengueruc on 24/07/2017.
 */
public class FamilyTestData {

    public static final Person sergio = new Person("Sergio", "Garcia Belenguer");
    public static final Person esther = new Person("Esther", "Garcia Briz");
    public static final Person nerea = new Person("Nerea", "Garcia Garcia");

    public static FamilySet familySet = new FamilySet();

    public static FamilyMap familyMap = new FamilyMap();

    static {
        familySet.add(sergio);
        familySet.add(esther);
        familySet.add(nerea);

        familyMap.add(sergio);
        familyMap.add(esther);
        familyMap.add(nerea);
    }
}
