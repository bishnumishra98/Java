// The Comparator interface in Java is used to create a custom comparator. It has the method compare(T o1, T o2) that you
// override to define how two objects should be compared. The result is:
// -> Negative if o1 is less than o2
// -> Zero if o1 equals o2
// -> Positive if o1 is greater than o2

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int roll;
    String name;
    double weight;

    Student(int roll, String name, double d) {
        this.roll = roll;
        this.name = name;
        this.weight = d;
    }

    // Override toString for better printing of Student objects
    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

// Comparator to sort students by roll number
class RollComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sorting by roll (ascending order)
        // return Integer.compare(s1.roll, s2.roll);
        return s1.roll - s2.roll;
    }
}

// Comparator to sort students by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sorting by name (alphabetically)
        return s1.name.compareTo(s2.name);
    }
}

// Comparator to sort students by weight
class WeightComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sorting by weight (ascending order)
        // return Double.compare(s1.weight, s2.weight);
        return (int) (s1.weight - s2.weight);
    }
}


public class CustomComparator {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vishnu", 78.5));
        students.add(new Student(2, "Disha", 58.5));
        students.add(new Student(3, "Krishna",85));

        // Sorting students by roll number
        System.out.println("Sorting by Roll Number:");
        Collections.sort(students, new RollComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting students by name
        System.out.println("\nSorting by Name:");
        Collections.sort(students, new NameComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting students by weight
        System.out.println("\nSorting by Weight:");
        Collections.sort(students, new WeightComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
