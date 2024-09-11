// When working with primitive data types like char, int, float, etc., a set automatically ensures that only unique elements are stored.
// However, when we create custom objects (even if the data in the objects is identical), the set identifies each object as
// distinct because they have different memory references.
// To ensure that custom objects are treated as unique based on their data, we need to override the equals() and hashCode() methods.
// These methods define the criteria for uniqueness, allowing the set to properly manage custom objects based on specified fields.

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

class Student1 {
    int roll;
    String name;

    Student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // This is optional but useful for seeing the actual data of objects in the output, instead of hash codes.
    @Override
    public String toString() {
        return "Student1{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}

class Student2 {
    int roll;
    String name;

    Student2(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }

    // This is optional but useful for seeing the actual data of objects in the output, instead of hash codes.
    @Override
    public String toString() {
        return "Student2{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}


public class S2_CustomObjectsInSet {
    public static void main(String[] args) {
        Set<Student1> set1 = new HashSet<>();

        Student1 a1 = new Student1(1, "Vishnu");
        Student1 a2 = new Student1(1, "Disha");
        Student1 a3 = new Student1(2, "Disha");
        Student1 a4 = new Student1(3, "Disha");

        set1.add(a1);
        set1.add(a2);
        set1.add(a3);
        set1.add(a4);

        System.out.println(set1);   // o/p: [Student1{roll=1, name='Vishnu'}, Student1{roll=1, name='Disha'}, Student1{roll=2, name='Disha'}, Student1{roll=3, name='Disha'}]
        // The above output shows that 4 distinct objects have been stored in the set. However, if we want to ensure that
        // Student1 objects are considered unique based on their roll number, we need to override the equals() and hashCode() methods.


        Set<Student2> set2 = new HashSet<>();

        Student2 b1 = new Student2(1, "Vishnu");
        Student2 b2 = new Student2(1, "Disha");
        Student2 b3 = new Student2(2, "Disha");
        Student2 b4 = new Student2(3, "Disha");

        set2.add(b1);
        set2.add(b2);
        set2.add(b3);
        set2.add(b4);

        System.out.println(set2);   // o/p: [Student2{roll=1, name='Vishnu'}, Student2{roll=2, name='Disha'}, Student2{roll=3, name='Disha'}]
        // Now the set has distinct objects based on roll.
    }
}
