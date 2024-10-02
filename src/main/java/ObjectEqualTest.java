import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ObjectEqualTest {

    public static void main(String[] args) {

        Test test1 = new Test("sham", "Sham Desc", 25, 3000);
        Test test2 = new Test("sham", "Sham Desc", 25, 3000);
        Test test3 = new Test("Ram", "Ram desc", 32, 56000);

        Set<Test> uniqueTestObjects = new HashSet<>();
        uniqueTestObjects.add(test1);
        uniqueTestObjects.add(test2);
        uniqueTestObjects.add(test3);
        System.out.println(uniqueTestObjects.size());
    }
}

record Test(String name, String desc, int age, double salary)  {

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;

        return test.name.equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }*/

}