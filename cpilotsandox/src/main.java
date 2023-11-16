import java.util.LinkedList;

public class main {

    // function to calculate square root of a number
    public static double sqrt(double x) {
        double y = 1;
        double e = 0.000000000000001;
        while (Math.abs(x - y * y) > e) {
            y = (y + x / y) / 2;
        }
        return y;
    }

    // function to calculate sin of a number
    public static double sin(double x) {
        double y = 0;
        double e = 0.000000000000001;
        double t = x;
        int i = 1;
        while (Math.abs(t) > e) {
            y += t;
            t *= -x * x / (2 * i) / (2 * i + 1);
            i++;
        }
        return y;
    }

    // function to produce exponentially distributed random numbers
    public static double exp(double lambda) {
        double u = Math.random();
        return -Math.log(1 - u) / lambda;
    }

    // three-phase simulation function


    public static void main(String[] args) {
        System.out.println("Hello World!");

        // print even numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

        // print fibonacci sequence
        int a = 0, b = 1, c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 10; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        // use person class to create an array of persons
        Person[] people = new Person[3];
        people[0] = new Person("John", 20);
        people[1] = new Person("Jane", 21);
        people[2] = new Person("Joe", 22);

        // print the array of persons
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName() + " " + people[i].getAge());
        }

        // print the array of persons using a foreach loop
        for (Person p : people) {
            System.out.println(p.getName() + " " + p.getAge());
        }

        // create a linked list of Persons
        LinkedList<Person> peopleList = new LinkedList<Person>();
        peopleList.add(new Person("John", 20));
        peopleList.add(new Person("Jane", 21));
        peopleList.add(new Person("Joe", 22));

        // print the linked list of persons
        for (Person p : peopleList) {
            System.out.println(p.getName() + " " + p.getAge());
        }

        // search for a person in the linked list
        Person p = new Person("Jane", 21);
        if (peopleList.contains(p)) {
            System.out.println("Found " + p.getName() + " " + p.getAge());
        } else {
            System.out.println("Not found " + p.getName() + " " + p.getAge());
        }



    }
}
