import java.util.*;

public class Main {

    private static void printPersonInfo(Person p) {
        p.introduce();
        if (p.getFriend() != null) {
            System.out.println("My friend is " + p.getFriend().getName());
        } else
            System.out.println("I have no friend :(");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alfred Berg", 32);
        Person p2 = new Person("Donald Duck", 33, p1);
        Person p3 = new Person("Jimmy Carter", 99);

        printPersonInfo(p2);
        p2.setFriend(p3);
        printPersonInfo(p2);
    }
}